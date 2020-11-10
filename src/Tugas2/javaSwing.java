package Tugas2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class javaSwing {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}


class GUI extends JFrame {
   final JTextField fnama = new JTextField(50);

   JLabel lnama = new JLabel(" Nama Lengkap ");
   
   JLabel lnim = new JLabel("NIM");
   final JTextField fnim = new JTextField(10);
   
   JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
   JRadioButton rblaki = new JRadioButton(" Laki-Laki ");
   JRadioButton rbperempuan = new JRadioButton("Perempuan ");
   
   JLabel lkotaasal = new JLabel("Kota Asal");
   final JTextField fkotaasal = new JTextField(20);

   JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha","Kong Hu Cu"};
   JComboBox cmbAgama = new JComboBox(namaAgama);

   JLabel lhobi = new JLabel(" Hobi ");
   JCheckBox cbNyanyi = new JCheckBox(" Nyanyi ");
   JCheckBox cbBasket = new JCheckBox(" Basket ");
   JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
   JCheckBox cbRenang = new JCheckBox(" Renang ");
   JCheckBox cbVoli = new JCheckBox(" Voli ");
   JCheckBox cbGambar = new JCheckBox(" Gambar ");

   JButton btnSave = new JButton("Save");
   JButton btnReset = new JButton("Reset");
   JButton btnClose = new JButton("Exit");

   public GUI() {
	setTitle("Form Biodata");
	setDefaultCloseOperation(3);
	setSize(400,350);

	ButtonGroup group = new ButtonGroup();
	group.add(rblaki);
	group.add(rbperempuan);

	setLayout(null);
        add(lnama);
        add(fnama);
        add(lnim);
        add(fnim);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lkotaasal);
        add(fkotaasal);
        add(lagama);
        add(cmbAgama);
        add(lhobi);
        add(cbNyanyi);
        add(cbBasket);
        add(cbSepakbola);
        add(cbRenang);
        add(cbVoli);
        add(btnSave);
        add(btnReset);
        add(btnClose);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	lnama.setBounds(9,10,120,20);
        lnama.setBounds(15,10,120,20);
        fnama.setBounds(130,10,200,20);
        lnim.setBounds(9,35,120,20);
        lnim.setBounds(18,35,120,20);
        fnim.setBounds(130,35,200,20);
        ljeniskelamin.setBounds(9,60,120,20);
        ljeniskelamin.setBounds(15,60,120,20);
	rblaki.setBounds(130,60,100,20);
        rbperempuan.setBounds(230,60,100,20);
        lkotaasal.setBounds(9,85,120,20);
        lkotaasal.setBounds(18,85,120,20);
	fkotaasal.setBounds(130,85,200,20);
	lagama.setBounds(9,120,200,20);
        lagama.setBounds(16,120,200,20);
	cmbAgama.setBounds(130,120,200,20);
        lhobi.setBounds(10,160,120,20);
	lhobi.setBounds(16,160,120,20);
	cbNyanyi.setBounds(130,160,100,20);
        cbBasket.setBounds(230,160,100,20);
        cbSepakbola.setBounds(130,180,100,20);
        cbRenang.setBounds(230,180,100,20);
        cbGambar.setBounds(130,200,100,20);
        btnSave.setBounds(130,250,120,20);
        btnReset.setBounds(130,280,120,20);
        btnClose.setBounds(130,310,120,20);
	setVisible(true);
   }
}
