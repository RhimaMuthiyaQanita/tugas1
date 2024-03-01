package org.example;

import java.util.Scanner;

public class LibraryLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi objek Admin dan Mahasiswa
        Admin admin = new Admin("admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("123456789012345", "mahasiswa123");

        // Pilihan menu
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih tipe pengguna (1/2): ");
        int choice = scanner.nextInt();

        scanner.nextLine();  // Membersihkan newline dari buffer

        // Proses login sesuai pilihan
        switch (choice) {
            case 1:
                // Login sebagai admin
                System.out.print("Masukkan username admin: ");
                String adminUsername = scanner.nextLine();
                System.out.print("Masukkan password admin: ");
                String adminPassword = scanner.nextLine();

                if (admin.login(adminUsername, adminPassword)) {
                    System.out.println("Login admin berhasil.");
                } else {
                    System.out.println("Login admin gagal.");
                }
                break;

            case 2:
                // Login sebagai mahasiswa
                System.out.print("Masukkan NIM mahasiswa: ");
                String mahasiswaNim = scanner.nextLine();
                System.out.print("Masukkan password mahasiswa: ");
                String mahasiswaPassword = scanner.nextLine();

                if (mahasiswa.login(mahasiswaNim, mahasiswaPassword)) {
                    System.out.println("Login mahasiswa berhasil.");
                } else {
                    System.out.println("Login mahasiswa gagal.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
