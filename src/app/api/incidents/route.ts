import { NextResponse } from 'next/server';
import { query } from '@/utils/client';

export async function GET() {
  try {
    const rows = await query('SELECT * FROM Incident');
    return NextResponse.json(rows);
  } catch (error) {
    console.error(error);
    return NextResponse.json(
      { error: 'Failed to fetch incidents', details: error.message },
      { status: 500 }
    );
  }
}

export async function POST(req: Request) {
  try {
    const body = await req.json();
    const { caller_ID, personnel_ID, address, priority, description } = body;

    const result = await query(
      'INSERT INTO Incident (caller_ID, personnel_ID, address, priority, description) VALUES (?, ?, ?, ?, ?)',
      [caller_ID, personnel_ID, address, priority, description]
    );

    return NextResponse.json({ message: 'Incident created', id: result.insertId });
  } catch (error) {
    console.error(error);
    return NextResponse.json(
      { error: 'Failed to create incident', details: error.message },
      { status: 500 }
    );
  }
}

// TODO: Fix this getting gobbled-up by the Route handler 
// export async function PUT(req: Request, { params }: { params: { id: string } }) {
//   try {
//     const { id } = params;
//     const body = await req.json();
//     const { status } = body;
//
//     const result = await query(
//       'UPDATE Incident SET status = ? WHERE incident_ID = ?',
//       [status, id]
//     );
//
//     if (result.affectedRows === 0) {
//       return NextResponse.json({ error: 'Incident not found' }, { status: 404 });
//     }
//
//     return NextResponse.json({ message: 'Incident updated' });
//   } catch (error) {
//     console.error(error);
//     return NextResponse.json(
//       { error: 'Failed to update incident', details: error.message },
//       { status: 500 }
//     );
//   }
// }

export async function DELETE(req: Request, { params }: { params: { id: string } }) {
  try {
    const { id } = params;

    const result = await query('DELETE FROM Incident WHERE incident_ID = ?', [id]);

    if (result.affectedRows === 0) {
      return NextResponse.json({ error: 'Incident not found' }, { status: 404 });
    }

    return NextResponse.json({ message: 'Incident deleted' });
  } catch (error) {
    console.error(error);
    return NextResponse.json(
      { error: 'Failed to delete incident', details: error.message },
      { status: 500 }
    );
  }
}
