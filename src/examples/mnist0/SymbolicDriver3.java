package mnist0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import gov.nasa.jpf.symbc.Debug;
import gov.nasa.jpf.symbc.DNN;
import gov.nasa.jpf.symbc.DNNDataGeneralize;
import gov.nasa.jpf.symbc.DNNGeneralize;
public class SymbolicDriver3 {
	static final int IMG_HEIGHT = 28;
	static final int IMG_WIDTH = 28; 
	static String originalconstraints="-2.8570980094621485\n" + 
			"-12.616044436313283\n" + 
			"-0.8882849076706775\n" + 
			"( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( *  ( +  ( +  sym0 -0.06046367436647415) sym0) 3.5476223850645923) -0.01835404708981514) ( *  ( +  ( +  sym1 -0.0313461609184742) sym1) 0.0)) ( *  ( +  ( +  sym2 0.04345403239130974) sym2) 0.0)) ( *  ( +  ( +  sym3 -0.013945762068033218) sym3) 0.0)) ( *  ( +  ( +  sym4 0.031384922564029694) sym4) 8.564907412200919)) ( *  ( +  ( +  sym5 -0.029852882027626038) sym5) 0.0)) ( *  ( +  ( +  sym6 -0.03841959685087204) sym6) 0.0)) ( *  ( +  ( +  sym7 -0.04210403189063072) sym7) 5.750594468538426)) ( *  ( +  ( +  sym8 -0.037397466599941254) sym8) 15.42244516727632)) ( *  ( +  ( +  sym9 -0.049095410853624344) sym9) 0.0)) ( *  ( +  ( +  sym10 0.016338961198925972) sym10) 4.778997392320202)) ( *  ( +  ( +  sym11 0.05109405890107155) sym11) 0.0)) ( *  ( +  ( +  sym12 -0.019847698509693146) sym12) 0.0)) ( *  ( +  ( +  sym13 -0.018803974613547325) sym13) 0.0)) ( *  ( +  ( +  sym14 -0.023422470316290855) sym14) 0.0)) ( *  ( +  ( +  sym15 0.0228608138859272) sym15) 0.0)) ( *  ( +  ( +  sym16 -0.00919797457754612) sym16) 1.1270935258396384)) ( *  ( +  ( +  sym17 -0.042945995926856995) sym17) 9.463938849777906)) ( *  ( +  ( +  sym18 0.05054730176925659) sym18) 18.328960983003228)) ( *  ( +  ( +  sym19 0.016863131895661354) sym19) 0.0)) ( *  ( +  ( +  sym20 0.07283835858106613) sym20) 3.5135375511780964)) ( *  ( +  ( +  sym21 0.06173355504870415) sym21) 2.836845009675187)) ( *  ( +  ( +  sym22 -0.06577461957931519) sym22) 0.0)) ( *  ( +  ( +  sym23 -0.018264422193169594) sym23) 18.219576796648095)) ( *  ( +  ( +  sym24 -0.04487038403749466) sym24) 7.5175237054079735)) ( *  ( +  ( +  sym25 -0.04980514943599701) sym25) 2.3000392155388596)) ( *  ( +  ( +  sym26 -0.055261291563510895) sym26) 5.506665403991785)) ( *  ( +  ( +  sym27 0.03701265901327133) sym27) 1.2222738149404413)) ( *  ( +  ( +  sym28 -0.024615975096821785) sym28) 0.0)) ( *  ( +  ( +  sym29 0.02736976370215416) sym29) 2.051713100188397)) ( *  ( +  ( +  sym30 0.029786940664052963) sym30) 14.00560404662024)) ( *  ( +  ( +  sym31 0.009544670581817627) sym31) 19.47382354937154)) ( *  ( +  ( +  sym32 0.02284061163663864) sym32) 9.436072229276194)) ( *  ( +  ( +  sym33 0.04852351173758507) sym33) 14.544051771052542)) ( *  ( +  ( +  sym34 0.014849969185888767) sym34) 0.0)) ( *  ( +  ( +  sym35 0.045198578387498856) sym35) 6.58775189718136)) ( *  ( +  ( +  sym36 -0.01933206059038639) sym36) 3.8861152568457054)) ( *  ( +  ( +  sym37 -0.04864118620753288) sym37) 24.169773751104223)) ( *  ( +  ( +  sym38 -0.0315311960875988) sym38) 4.543140768161106)) ( *  ( +  ( +  sym39 0.011186201125383377) sym39) 8.68674821433861)) ( *  ( +  ( +  sym40 -0.04649411141872406) sym40) 5.328583542410048)) ( *  ( +  ( +  sym41 -0.037908006459474564) sym41) 0.0)) ( *  ( +  ( +  sym42 -0.06413291394710541) sym42) 0.3127091006326493)) ( *  ( +  ( +  sym43 0.03098311461508274) sym43) 7.278494816001733)) ( *  ( +  ( +  sym44 -0.003217910416424274) sym44) 13.764518401193799)) ( *  ( +  ( +  sym45 0.003268965985625982) sym45) 12.257192342639017)) ( *  ( +  ( +  sym46 -0.002780452370643616) sym46) 0.0)) ( *  ( +  ( +  sym47 -0.044790733605623245) sym47) 0.0)) ( *  ( +  ( +  sym48 -0.037726521492004395) sym48) 0.5668033319468155)) ( *  ( +  ( +  sym49 0.010499799624085426) sym49) 0.0)) ( *  ( +  ( +  sym50 0.0350518524646759) sym50) 0.0)) ( *  ( +  ( +  sym51 -0.005675949156284332) sym51) 3.377784111629347)) ( *  ( +  ( +  sym52 -0.005842783953994513) sym52) 10.228960294474678)) ( *  ( +  ( +  sym53 0.027266452088952065) sym53) 0.0)) ( *  ( +  ( +  sym54 -0.005694967694580555) sym54) 9.462972840960166)) ( *  ( +  ( +  sym55 -0.04387560486793518) sym55) 0.0)) ( *  ( +  ( +  sym56 0.01627124659717083) sym56) 0.0)) ( *  ( +  ( +  sym57 0.019650977104902267) sym57) 11.877998276776422)) ( *  ( +  ( +  sym58 -0.019234469160437584) sym58) 0.0)) ( *  ( +  ( +  sym59 0.03335685655474663) sym59) 0.0)) ( *  ( +  ( +  sym60 -0.005822799168527126) sym60) 0.0)) ( *  ( +  ( +  sym61 -0.01881188340485096) sym61) 0.0)) ( *  ( +  ( +  sym62 0.003686549142003059) sym62) 4.216859533455893)) ( *  ( +  ( +  sym63 -0.06683539599180222) sym63) 7.300378822389811)) ( *  ( +  ( +  sym64 -0.005384256131947041) sym64) 0.0)) ( *  ( +  ( +  sym65 0.0144033906981349) sym65) 3.786615832449018)) ( *  ( +  ( +  sym66 -0.026913214474916458) sym66) 0.406277580952187)) ( *  ( +  ( +  sym67 -0.08112309128046036) sym67) 0.0)) ( *  ( +  ( +  sym68 0.03794701769948006) sym68) 1.5134680854128681)) ( *  ( +  ( +  sym69 -0.014373070560395718) sym69) 0.08674415368041544)) ( *  ( +  ( +  sym70 0.012855526059865952) sym70) 0.0)) ( *  ( +  ( +  sym71 0.004720548633486032) sym71) 6.658378515129073)) ( *  ( +  ( +  sym72 -0.04984678328037262) sym72) 0.0)) ( *  ( +  ( +  sym73 -0.09900873154401779) sym73) 0.0)) ( *  ( +  ( +  sym74 0.047909244894981384) sym74) 11.034778097205482)) ( *  ( +  ( +  sym75 -0.01729472354054451) sym75) 3.131903383289934)) ( *  ( +  ( +  sym76 -0.01593691296875477) sym76) 0.0)) ( *  ( +  ( +  sym77 -0.023361124098300934) sym77) 0.0)) ( *  ( +  ( +  sym78 0.0704319104552269) sym78) 1.297422829185653)) ( *  ( +  ( +  sym79 -0.01670435070991516) sym79) 0.0)) ( *  ( +  ( +  sym80 -0.008379842154681683) sym80) 9.593784458618396)) ( *  ( +  ( +  sym81 0.00088558456627652) sym81) 12.585525795484516)) ( *  ( +  ( +  sym82 0.04639863222837448) sym82) 6.157112688541018)) ( *  ( +  ( +  sym83 -0.014870794489979744) sym83) 6.231180579822787)) ( *  ( +  ( +  sym84 -0.0097371656447649) sym84) 0.0)) ( *  ( +  ( +  sym85 0.032375823706388474) sym85) 9.38731305752019)) ( *  ( +  ( +  sym86 -0.002039077691733837) sym86) 3.238321851593923)) ( *  ( +  ( +  sym87 -0.000690952641889453) sym87) 0.0)) ( *  ( +  ( +  sym88 0.047688331454992294) sym88) 0.0)) ( *  ( +  ( +  sym89 0.05864637717604637) sym89) 10.096229117261887)) ( *  ( +  ( +  sym90 -0.036125548183918) sym90) 0.0)) ( *  ( +  ( +  sym91 0.04095308110117912) sym91) 0.0)) ( *  ( +  ( +  sym92 -0.014160366728901863) sym92) 0.0)) ( *  ( +  ( +  sym93 -0.01895676925778389) sym93) 11.91363445675155)) ( *  ( +  ( +  sym94 -0.01910310611128807) sym94) 0.0)) ( *  ( +  ( +  sym95 -0.001642982591874897) sym95) 0.0)) ( *  ( +  ( +  sym96 0.0516945905983448) sym96) 4.896257277221476)) ( *  ( +  ( +  sym97 -0.010741782374680042) sym97) 0.0)) ( *  ( +  ( +  sym98 -0.10540461540222168) sym98) 0.0)) ( *  ( +  ( +  sym99 -0.026155540719628334) sym99) 3.6391339425293197)) ( *  ( +  ( +  sym100 0.01338281948119402) sym100) 18.403616143822454)) ( *  ( +  ( +  sym101 -0.04777707904577255) sym101) 0.0)) ( *  ( +  ( +  sym102 -0.10880780965089798) sym102) 0.0)) ( *  ( +  ( +  sym103 0.03551586717367172) sym103) 0.0)) ( *  ( +  ( +  sym104 -0.05513566732406616) sym104) 0.0)) ( *  ( +  ( +  sym105 0.03563668951392174) sym105) 11.92784241920706)) ( *  ( +  ( +  sym106 0.03057936206459999) sym106) 16.655757900480765)) ( *  ( +  ( +  sym107 -0.04892415553331375) sym107) 0.0)) ( *  ( +  ( +  sym108 -0.03187358006834984) sym108) 4.225451345317888)) ( *  ( +  ( +  sym109 0.04734540358185768) sym109) 5.847052342379999)) ( *  ( +  ( +  sym110 0.03571989759802818) sym110) 0.0)) ( *  ( +  ( +  sym111 -0.03278931975364685) sym111) 0.0)) ( *  ( +  ( +  sym112 -0.02649812027812004) sym112) 0.0)) ( *  ( +  ( +  sym113 -0.038070276379585266) sym113) 0.0)) ( *  ( +  ( +  sym114 0.008493035100400448) sym114) 18.614714149364694)) ( *  ( +  ( +  sym115 0.04323075711727142) sym115) 6.9150167736169115)) ( *  ( +  ( +  sym116 -0.053112853318452835) sym116) 0.0)) ( *  ( +  ( +  sym117 0.010154778137803078) sym117) 8.91186311810503)) ( *  ( +  ( +  sym118 -0.032488755881786346) sym118) 2.504637345015941)) ( *  ( +  ( +  sym119 -0.05689089372754097) sym119) 20.168897075907264)) ( *  ( +  ( +  sym120 0.03738251328468323) sym120) 0.0)) ( *  ( +  ( +  sym121 -0.07944362610578537) sym121) 0.0)) ( *  ( +  ( +  sym122 0.05330949276685715) sym122) 0.0)) ( *  ( +  ( +  sym123 0.021549437195062637) sym123) 10.620373279748323)) ( *  ( +  ( +  sym124 0.014731591567397118) sym124) 0.0)) ( *  ( +  ( +  sym125 -0.020935919135808945) sym125) 0.0)) ( *  ( +  ( +  sym126 -0.06358283758163452) sym126) 13.96553307470075)) ( *  ( +  ( +  sym127 -0.005344864912331104) sym127) 8.241971089426034))\n" + 
			"2.313794925642722\n" + 
			"-0.7410625110858691\n" + 
			"-7.3217759530323825\n" + 
			"-5.609904343213226\n" + 
			"2.9935657253383607\n" + 
			"7.83629323917718\n";
	public static void main(String[] args) throws  Exception {
		String inputFile = DNNt.path+"inputs\\inn35.txt";
		File file = new File(inputFile); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		double[][][] a = new double[IMG_HEIGHT][IMG_WIDTH][1];
		String st;
		while ((st = br.readLine()) != null) {
			String[] values = st.split(",");
			int index = 0;
			while (index < values.length) {
				for (int i = 0; i <  IMG_HEIGHT; i++)
					for (int j = 0; j < IMG_WIDTH; j++)
						for (int k = 0; k < 1; k++)
						{
							Double val = Double.valueOf(values[index]);
							index++;
							a[i][j][k] = (double)(val);
						}
			}
		}
		int original=0;
		mnist0.DNNt model = new mnist0.DNNt();    
		if(original==1) {
			System.out.println("OLD IMPLEMENTATION");
			DNN.readDataFromFiles(DNNt.path+"params\\");
			model.biases0 = DNN.getBiases0();
			model.biases2 = DNN.getBiases2();
			model.biases6 = DNN.getBiases6();
			model.biases8 = DNN.getBiases8();
			model.weights0 = DNN.getWeights0();
			model.weights2 = DNN.getWeights2();
			model.weights6 = DNN.getWeights6();
			model.weights8 = DNN.getWeights8();
		}
		else
		{
			System.out.println("NEW IMPLEMENTATION");
			DNNGeneralize.readDataFromFiles(DNNt.path+"params\\",DNNt.path+"mnist0.json");
			model.biases0 = (double[]) DNNGeneralize.get_data("biases0");
			model.biases2 = (double[]) DNNGeneralize.get_data("biases2");
			model.biases6 = (double[]) DNNGeneralize.get_data("biases6");
			model.biases8 = (double[]) DNNGeneralize.get_data("biases8");
			model.weights0 = (double[][][][]) DNNGeneralize.get_data("weights0");
			model.weights2 = (double[][][][]) DNNGeneralize.get_data("weights2");
			model.weights6 = (double[][]) DNNGeneralize.get_data("weights6");
			model.weights8 = (double[][]) DNNGeneralize.get_data("weights8");
		}
		int label = model.run(a,3);
		System.out.println(DNNt.generatedconstraints);
		assert(DNNt.generatedconstraints.equals(originalconstraints));
		System.out.println("Test 3 Passed");
	}
}
