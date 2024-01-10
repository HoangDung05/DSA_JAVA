//Index /     Name    /   Age /   Class
//0     /Nguyễn Văn A /   10  /   5D4
//1     /Nguyễn Văn B /   9   /   4C3
//2     /Nguyễn Văn D /   8   /   3B2
//3     /Nguyễn Văn D /   7   /   2A1
//Thực hiện các vệc sau:
//1. Tạo mảng danh sách sinh viên
//2. Thêm sinh viên vào mảng theo chỉ mục như ở trên
//3. In toàn bộ danh sách sinh viên ra màn hình
//4. Tìm kiếm sinh viên có tên là  Nguyễn Văn A và in thông tin sinh viên đó ra màn hình.
//5. Tìm sinh viên nhiều tuổi nhất và in ra màn hình
//6. Tìm sinh viên ít tuổi nhất và in ra màn hình
//7. Đổi chỗ sinh viên có chỉ số 0 với sinh viên cho chỉ số 3. In lại mảng ra màn hình.

public class DSA_P2_3 {
    static class Student{
        String name;
        int age;
        String class_;
        public Student(String name, int age, String class_){
            this.name = name;
            this.age = age;
            this.class_ = class_;
        }

    }
    //tạo hàm in danh sách sinh viên
    static void printlist(Student[] students){
        for(int i = 0; i < students.length; i++){
            System.out.println("Index: " + i + ", Name: " + students[i].name + ", Age: " + students[i].age + ", class: " + students[i].class_);
        }
    }
    //tạo hàm tìm tên sinh viên và in thông tin sv đó
    static void searchname(Student[] students, String nameneedFind){
        for(int i = 0; i < students.length; i++){
            if(students[i].name.equals(nameneedFind)){
                System.out.println("Thông tin sinh viên cần tìm kiếm");
                System.out.println("Name: " + students[i].name + ", Age: " + students[i].age + ", class: " + students[i].class_);
                break;
            }
            System.out.println("hello");
        }
    }
    //tạo hàm in thông tin sinh viên nhiều tuổi nhất và ít tuổi nhất
    static void maxagestudent(Student[] students){
        int max = students[0].age;
        int min = students[0].age;
        int max_index = 0;
        int min_index = 0;
        for(int i = 1; i < students.length; i++){
            if (students[i].age > max){
                max = students[i].age;
                max_index = i;
            } else if (students[i].age < min) {
                min = students[i].age;
                min_index = i;
            }
        }
        System.out.println("Thông tin sinh viên nhiều tuổi nhất");
        System.out.println("Name: " + students[max_index].name + ", Age: " + students[max_index].age + ", class: " + students[max_index].class_);
        System.out.println("Thông tin sinh viên ít tuổi nhất");
        System.out.println("Name: " + students[min_index].name + ", Age: " + students[min_index].age + ", class: " + students[min_index].class_);

    }
    //tạo hàm hoán đổi vị trí 2 sinh viên
    static void swapstudent(Student[] students, int index1, int index2){
        Student swap = students[index1];
        students[index1] = students[index2];
        students[index2] = swap;
    }
    public static void main(String[] args) {
        //tạo mảng danh sách sinh viên
        Student[] studentArray = new Student[4];
        //thêm sinh viên vào mảng
        studentArray[0] = new Student("Nguyễn Văn A", 10, "5D4");
        studentArray[1] = new Student("Nguyễn Văn B", 9, "4C3");
        studentArray[2] = new Student("Nguyễn Văn D", 8, "3B2");
        studentArray[3] = new Student("Nguyễn Văn D", 7, "2A1");
        //in danh sach sinh vien
        printlist(studentArray);
        //tìm và in thông tin sv
        searchname(studentArray, "Nguyễn Văn A");
        //in thông tin sinh viên nhiều tuổi nhất
        maxagestudent(studentArray);
        //hoán đổi vị tri 2 sinh viên
        swapstudent(studentArray, 0, 3);
        System.out.println("Thông tin sinh viên sau khi hoán đổi");
        printlist(studentArray);



    }
}
