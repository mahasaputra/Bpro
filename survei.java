//import java.io.*;

public class survei {

public static void main (String []args)  {
		//BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		//Inisialisasi Variabel
		int jml = 61;
		String nama[] = new String[jml];
		String os[] = new String[jml];
		int andro = ;
		int bb = 0;
		int win = 0;
		int ios = 0;

		//input data nama
			nama[0] = "Fahrizal";nama[1] = "Komang";nama[2] = "Al Arif";nama[3] = "Nur Rahman";nama[4] = "Naufal";
			nama[5] = "Tedi";nama[6] = "Diki";nama[7] = "Yanuar";nama[8] = "Iqbal";nama[9] = "Harits";nama[10] = "Dimas";
			nama[11] = "Tedi";nama[12] = "Diki";nama[13] = "Yanuar";nama[14] = "Iqbal";nama[15] = "Harits";nama[16] = "Dimas";
			nama[17] = "Tedi";nama[18] = "Diki";nama[19] = "Yanuar";nama[20] = "Iqbal";nama[21] = "Harits";nama[22] = "Dimas";
			nama[23] = "Tedi";nama[24] = "Diki";nama[25] = "Yanuar";nama[26] = "Iqbal";nama[27] = "Harits";nama[28] = "Dimas";
			nama[29] = "Tedi";nama[30] = "Diki";nama[31] = "Yanuar";nama[32] = "Iqbal";nama[33] = "Harits";nama[34] = "Dimas";
			nama[35] = "Tedi";nama[36] = "Diki";nama[37] = "Yanuar";nama[38] = "Iqbal";nama[39] = "Harits";nama[40] = "Dimas";
			nama[41] = "Tedi";nama[42] = "Diki";nama[43] = "Yanuar";nama[44] = "Iqbal";nama[45] = "Harits";nama[46] = "Dimas";
			nama[47] = "Tedi";nama[48] = "Diki";nama[49] = "Yanuar";nama[50] = "Iqbal";nama[51] = "Harits";nama[52] = "Dimas";
			nama[53] = "Tedi";nama[54] = "Diki";nama[55] = "Yanuar";nama[56] = "Iqbal";nama[57] = "Harits";nama[58] = "Dimas";
			nama[59] = "Tedi";nama[60] = "Diki";
		//input data os
			os[0] = "Fahrizal";os[1] = "Komang";os[2] = "Al Arif";os[3] = "Nur Rahman";os[4] = "Naufal";
			os[5] = "Tedi";os[6] = "Diki";os[7] = "Yanuar";os[8] = "Iqbal";os[9] = "Harits";os[10] = "Dimas";
			os[11] = "Tedi";os[12] = "Diki";os[13] = "Yanuar";os[14] = "Iqbal";os[15] = "Harits";os[16] = "Dimas";
			os[17] = "Tedi";os[18] = "Diki";os[19] = "Yanuar";os[20] = "Iqbal";os[21] = "Harits";os[22] = "Dimas";
			os[23] = "Tedi";os[24] = "Diki";os[25] = "Yanuar";os[26] = "Iqbal";os[27] = "Harits";os[28] = "Dimas";
			os[29] = "Tedi";os[30] = "Diki";os[31] = "Yanuar";os[32] = "Iqbal";os[33] = "Harits";os[34] = "Dimas";
			os[35] = "Tedi";os[36] = "Diki";os[37] = "Yanuar";os[38] = "Iqbal";os[39] = "Harits";os[40] = "Dimas";
			os[41] = "Tedi";os[42] = "Diki";os[43] = "Yanuar";os[44] = "Iqbal";os[45] = "Harits";os[46] = "Dimas";
			os[47] = "Tedi";os[48] = "Diki";os[49] = "Yanuar";os[50] = "Iqbal";os[51] = "Harits";os[52] = "Dimas";
			os[53] = "Tedi";os[54] = "Diki";os[55] = "Yanuar";os[56] = "Iqbal";os[57] = "Harits";os[58] = "Dimas";
			os[59] = "Tedi";os[60] = "Diki";

		//proses pencarian data
		int i;
		for (i=0; i!=jml;i++){
			System.out.println(i+". Nama : "+nama[i]);
			if ( os[i].equalsIgnoreCase("blackberry"))
			{
				bb += 1; 
			}
			else if (os[i].equalsIgnoreCase("android")){
				andro += 1;
			}
			else if (os[i].equalsIgnoreCase("windows")){
				win+= 1;
			}
			else if (os[i].equalsIgnoreCase("ios")){
				ios+=1;
			}
		}
		
		System.out.println("Android : "+andro);
		System.out.println("Blackberry : "+bb);
		System.out.println("Windows : "+win);
		System.out.println("IOS : "+ios);
		
		
		}
}
