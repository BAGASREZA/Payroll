package test;

import pajak.Pajak;

public class TestRunner {
    public static void main(String[] args) {
        Pajak pajak = new Pajak();
        
        double biayaJabatan;
        
        System.out.println("Test Case 1");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.MANAGER,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 2");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.SENIORMANAGER,"04/01/2020" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 3");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.JUNIORMANAGER,"05/01/2021" ,"01/04/2021" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 4");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.GENERALMANAGER,"05/02/2021" ,"01/05/2021" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 5");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.ASISTANTMANAGER,"01/05/2018" ,"01/05/2021" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 6");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.GENERALMANAGER,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 7");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.MANAGER,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 8");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.ASISTANTMANAGER,"05/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 9");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.SENIORMANAGER,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 10");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.JUNIORMANAGER,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 11");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.TEKNISI,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
        System.out.println("Test Case 12");
        biayaJabatan = pajak.hitungBiayaJabatan(Pajak.jabatan.DRIVER,"06/01/2018" ,"31/12/2020" );
        System.out.println(biayaJabatan);
    }
}
