package Main;

import QuanLySach.DAO.MyConnect;
import QuanLySach.GUI.DangNhapGUI;

public class Main {

    public static void main(String[] args) {
        new MyConnect(); // gọi pt kết nối database
        changLNF("Nimbus"); // gọi phương thức changLNF và nhận vào tham số String  đại diện cho tên của giao diện người dùng muốn sử dụng 
        DangNhapGUI login = new DangNhapGUI(); // gọi đến 
        login.showWindow();// gọi đến pt windown()
    }
    // look and feel
    
    public static void changLNF(String nameLNF) {
        try {
        	//duyệt tất cả các gaio diện người dùng đã cài đặt , nếu tên của một giao diện người dùng trùng tên tham số truyền vào thì pt LNF được gọi
        	// của lớp UIManager thay đổi tên giao diện người dùng là tham số truyền vào
            for (javax.swing.UIManager.LookAndFeelInfo	 info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (nameLNF.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            // lỗi ngoaị lệ
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
    }
}

