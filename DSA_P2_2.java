// Đề bài:
// 1. Tạo ra một sinh viên với các thông tin như sau: Tên là Nguyễn Văn A, 6 tuổi và học lớp 1A3
// 2. In thông tin của sinh viên đó ra màn hình với định dạng như sau: Name: Nguyễn Văn A - Age: 6 - Class: 1A3
// 3. Chuyển sinh viên đó sang lớp 1A7
// 4. Xóa bỏ dữ liệu của sinh viên A 

class Student {
    String name;
    int age;
    String class_;

    public Student(String name, int age, String class_) {
        this.name = name;
        this.age = age;
        this.class_ = class_;
    }

    public static void main(String[] args) {
        // cap nhat thong tin cho sinh vien
        Student student1 = new Student("Nguyễn Văn A", 6, "1A3");
        // in ra man hinh thong tin cua sinh vien
        System.out.println("Name: " + student1.name + " - Age: " + student1.age + " - Class: " + student1.class_);
        // chuyen sinh vien do sang lop 1A7
        student1.class_ = "1A7";
        System.out.println("Name: " + student1.name + " - Age: " + student1.age + " - Class: " + student1.class_);
        // xoa bo du lieu cua sinh vien A
        student1 = null;

    }
}
