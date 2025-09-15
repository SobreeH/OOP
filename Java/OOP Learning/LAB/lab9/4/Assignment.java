import java.util.Scanner; // import คลาส Scanner ในแพ็คเกจ java.util
public class Assignment { //ประกาศคลาส Assignment โดยกำหนด Access Modifier เป็น public
    public static void main(String[] args) { //ประกาศเมธอด main
      // สร้าง object ของคลาส Scanner เพื่อใช้รับค่าจากผู้ใช้
      Scanner sc = new Scanner(System.in);
      System.out.print("Type your name: "); // แสดงข้อความ "Type your name: "
      String nameInput = sc.nextLine(); // เรียกเมธอดสำหรับรับค่าข้อความจากผู้ใช้
      process(nameInput); // เรียกใช้เมธอดชื่อ process พร้อมส่งค่าของตัวแปร nameInput ไปทำงาน
    }

    public static void process(String name) { // ประกาศเมธอด process ที่รับ argument 1 ข้อความ
       // เปลี่ยนข้อความในตัวแปร name ให้เป็นตัวอักษรพิมพ์ใหญ่ทั้งหมด
       name = name.toUpperCase();
       // แสดงจำนวนอักขระทั้งหมดของข้อความในตัวแปร name ว่ามีอักขระกี่ตัว
       System.out.println(name + " has " + name.length() + " letters");
    }
}