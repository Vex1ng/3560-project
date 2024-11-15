import { ReactNode } from "react";
import Image from "next/image";
import arrow from "../../../public/images/chevron_down.png";

interface DropdownProps {
  children: ReactNode;
}

export default function Dropdown({ children }: DropdownProps) {
  return (
    <div className="flex flex-row gap-x-[5px] items-center">
      {children}
      <Image src={arrow} className="mt-1" alt="chevron_down" width={24} height={24}/>
    </div>
  );
}
