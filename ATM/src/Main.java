import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.Scanner;

class Account {
    String Username;
    String Password;
    int balance;

    public Account() {
        Username = "DaoXuanDuc";
        Password = "duc260197";
        balance = 1000000;
    }

    public void login(String a, String b) {
        if (a.equals(Username) && b.equals(Password)) {
            System.out.println("Show option");
            System.out.println("hay nhap so de vao cac tuy chon");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("1.See more Infomation Custom: " + Username);
            System.out.println("2.Rut tien mat");
            if (a == 1) {
                System.out.println(Username + "\n" + Password + "\n" + balance);
                System.out.print("Ban co muon tiep tuc khong: Y or N");
                String c = sc.nextLine();
                if (c == "Y") {
                    login(String, String);
                } else if (c == "N") {
                    System.out.println("ket thuc giao dich");
                } else {
                    System.out.println("2.Rut tien mat: ");
                    System.out.println("Hien thi so du tai khoan: " + balance);
                    System.out.println("Nhap so tien ban muon rut" + int b = sc.nextInt());
                    balance = balance - b;
                    String c = sc.nextLine();
                    if (c == "Y") {
                        login(String, String);
                    } else if (c == "N") {
                        System.out.println("ket thuc giao dich");
                    }
                    System.out.println("So du con lai" + balance);
                    System.out.println("Ban co muon tiep tuc khong: Y or N");

                }else{
                    System.out.println("Tai khoan hoac mat khau khong chinh xac hay thu dang nhap lai");
                }
            }
        }
        public class Main {
            public static void main(String[] args) {
                Account account = new Account();
                String username;
                String password;
                int balance;
                Scanner sc = new Scanner(System.in);
                System.out.print("login here");
                System.out.print("Username: ");
                username = sc.nextLine();
                System.out.print("Password: ");
                password = sc.nextLine();
                account.login();
                login(username, password);
            }
        }
    }