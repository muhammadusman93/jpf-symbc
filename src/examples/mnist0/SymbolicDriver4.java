package mnist0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import gov.nasa.jpf.symbc.Debug;
import gov.nasa.jpf.symbc.DNN;
import gov.nasa.jpf.symbc.DNNDataGeneralize;
import gov.nasa.jpf.symbc.DNNGeneralize;
public class SymbolicDriver4 {
	static final int IMG_HEIGHT = 28;
	static final int IMG_WIDTH = 28; 
	static String originalconstraints="-4.9537200787829265\n" + 
			"5.524849548620649\n" + 
			"9.769135236145747\n" + 
			"2.285508397497435\n" + 
			"( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( *  ( +  ( +  sym0 -0.04158330708742142) sym0) 10.637233450559474) 0.011695618741214275) ( *  ( +  ( +  sym1 0.04923854023218155) sym1) 0.0)) ( *  ( +  ( +  sym2 -0.03859906643629074) sym2) 7.561582257215535)) ( *  ( +  ( +  sym3 -0.006495310459285975) sym3) 12.035096611750793)) ( *  ( +  ( +  sym4 0.06595665961503983) sym4) 0.0)) ( *  ( +  ( +  sym5 0.024251095950603485) sym5) 0.0)) ( *  ( +  ( +  sym6 0.021287402138113976) sym6) 0.0)) ( *  ( +  ( +  sym7 -0.06887874752283096) sym7) 8.546796307700857)) ( *  ( +  ( +  sym8 0.022454435005784035) sym8) 2.63044502014962)) ( *  ( +  ( +  sym9 -0.05326063930988312) sym9) 4.277085933451414)) ( *  ( +  ( +  sym10 0.020649580284953117) sym10) 8.575909038430337)) ( *  ( +  ( +  sym11 -0.00025783566525206) sym11) 0.0)) ( *  ( +  ( +  sym12 -0.03002171963453293) sym12) 0.0)) ( *  ( +  ( +  sym13 -0.04669879749417305) sym13) 0.0)) ( *  ( +  ( +  sym14 -0.027263617143034935) sym14) 0.0)) ( *  ( +  ( +  sym15 0.007002205587923527) sym15) 5.056526071177129)) ( *  ( +  ( +  sym16 0.02012008987367153) sym16) 15.134708730010583)) ( *  ( +  ( +  sym17 0.04411178454756737) sym17) 7.195775350850671)) ( *  ( +  ( +  sym18 0.05344424769282341) sym18) 0.0)) ( *  ( +  ( +  sym19 0.010027730837464333) sym19) 0.3081133330543915)) ( *  ( +  ( +  sym20 0.023995673283934593) sym20) 11.873032995520822)) ( *  ( +  ( +  sym21 -0.052403584122657776) sym21) 0.0)) ( *  ( +  ( +  sym22 0.007741140201687813) sym22) 0.0)) ( *  ( +  ( +  sym23 -0.022534416988492012) sym23) 14.861575324403438)) ( *  ( +  ( +  sym24 0.03782680630683899) sym24) 14.871075053174197)) ( *  ( +  ( +  sym25 0.08606121689081192) sym25) 4.495756698746583)) ( *  ( +  ( +  sym26 0.040016718208789825) sym26) 4.178349736535366)) ( *  ( +  ( +  sym27 -0.05834593251347542) sym27) 0.0)) ( *  ( +  ( +  sym28 -0.0479661263525486) sym28) 0.0)) ( *  ( +  ( +  sym29 -0.04297223314642906) sym29) 6.671754199427216)) ( *  ( +  ( +  sym30 -0.058501116931438446) sym30) 19.09791339232355)) ( *  ( +  ( +  sym31 0.012900588102638721) sym31) 0.0)) ( *  ( +  ( +  sym32 -0.004478985909372568) sym32) 24.712320116052496)) ( *  ( +  ( +  sym33 -0.04687066003680229) sym33) 0.0)) ( *  ( +  ( +  sym34 -0.04529976099729538) sym34) 0.0)) ( *  ( +  ( +  sym35 -0.023314597085118294) sym35) 10.726620555527983)) ( *  ( +  ( +  sym36 0.012556633912026882) sym36) 6.6727842644096365)) ( *  ( +  ( +  sym37 -0.001861329423263669) sym37) 7.581801113226908)) ( *  ( +  ( +  sym38 0.04327792674303055) sym38) 0.07912827070955522)) ( *  ( +  ( +  sym39 0.011071986518800259) sym39) 0.0)) ( *  ( +  ( +  sym40 0.024414679035544395) sym40) 0.0)) ( *  ( +  ( +  sym41 -0.010435380041599274) sym41) 0.0)) ( *  ( +  ( +  sym42 -0.029596570879220963) sym42) 0.45449812002375695)) ( *  ( +  ( +  sym43 0.022868847474455833) sym43) 2.8988390023417523)) ( *  ( +  ( +  sym44 -0.001690334756858647) sym44) 0.0)) ( *  ( +  ( +  sym45 0.05330270901322365) sym45) 0.0)) ( *  ( +  ( +  sym46 0.000857078761328012) sym46) 0.0)) ( *  ( +  ( +  sym47 -0.016277175396680832) sym47) 0.0)) ( *  ( +  ( +  sym48 0.06000934913754463) sym48) 0.0)) ( *  ( +  ( +  sym49 -0.030881457030773163) sym49) 6.712996210491844)) ( *  ( +  ( +  sym50 0.03165529668331146) sym50) 0.0)) ( *  ( +  ( +  sym51 -0.04317260906100273) sym51) 1.1268229857865384)) ( *  ( +  ( +  sym52 0.05587804690003395) sym52) 0.0)) ( *  ( +  ( +  sym53 0.04421151429414749) sym53) 0.0)) ( *  ( +  ( +  sym54 0.04534340649843216) sym54) 4.256139254822901)) ( *  ( +  ( +  sym55 -0.013937936164438725) sym55) 10.313448090937904)) ( *  ( +  ( +  sym56 -0.002075369702652097) sym56) 0.0)) ( *  ( +  ( +  sym57 0.07635708153247833) sym57) 6.558734917210125)) ( *  ( +  ( +  sym58 0.01869049482047558) sym58) 0.0)) ( *  ( +  ( +  sym59 0.03932012990117073) sym59) 0.0)) ( *  ( +  ( +  sym60 -0.038986917585134506) sym60) 0.0)) ( *  ( +  ( +  sym61 -0.040150031447410583) sym61) 0.0)) ( *  ( +  ( +  sym62 -0.05554931238293648) sym62) 6.477041881422531)) ( *  ( +  ( +  sym63 0.000613826850894839) sym63) 0.0)) ( *  ( +  ( +  sym64 0.042133405804634094) sym64) 21.90163819954823)) ( *  ( +  ( +  sym65 -0.01843714900314808) sym65) 0.0)) ( *  ( +  ( +  sym66 0.05083850771188736) sym66) 21.919128710007673)) ( *  ( +  ( +  sym67 -0.010942628607153893) sym67) 0.0)) ( *  ( +  ( +  sym68 0.03835973143577576) sym68) 0.0)) ( *  ( +  ( +  sym69 0.02226324751973152) sym69) 8.407754148683246)) ( *  ( +  ( +  sym70 -0.014841458760201931) sym70) 0.0)) ( *  ( +  ( +  sym71 0.03965233638882637) sym71) 20.32146478585475)) ( *  ( +  ( +  sym72 0.027627456933259964) sym72) 0.0)) ( *  ( +  ( +  sym73 0.07122598588466644) sym73) 0.0)) ( *  ( +  ( +  sym74 -0.05066337808966637) sym74) 20.386715098144794)) ( *  ( +  ( +  sym75 -0.02999638393521309) sym75) 16.02135935345156)) ( *  ( +  ( +  sym76 0.009702893905341625) sym76) 14.039237435229117)) ( *  ( +  ( +  sym77 -0.024634230881929398) sym77) 0.0)) ( *  ( +  ( +  sym78 0.022991841658949852) sym78) 15.43582884230156)) ( *  ( +  ( +  sym79 0.021369757130742073) sym79) 0.6223141872265952)) ( *  ( +  ( +  sym80 0.008930048905313015) sym80) 0.0)) ( *  ( +  ( +  sym81 -0.03929732367396355) sym81) 10.757260984220286)) ( *  ( +  ( +  sym82 0.032518111169338226) sym82) 8.645471430007351)) ( *  ( +  ( +  sym83 -0.00625839876011014) sym83) 0.0)) ( *  ( +  ( +  sym84 0.05160532891750336) sym84) 7.240628271079194)) ( *  ( +  ( +  sym85 -0.0528729148209095) sym85) 18.299153759395452)) ( *  ( +  ( +  sym86 -0.000776609056629241) sym86) 0.0)) ( *  ( +  ( +  sym87 -0.043866146355867386) sym87) 0.0)) ( *  ( +  ( +  sym88 -0.12590327858924866) sym88) 0.0)) ( *  ( +  ( +  sym89 -0.03528923541307449) sym89) 4.525732178078072)) ( *  ( +  ( +  sym90 0.014750526286661625) sym90) 0.0)) ( *  ( +  ( +  sym91 0.011425632983446121) sym91) 2.7151827187053827)) ( *  ( +  ( +  sym92 -0.033861611038446426) sym92) 3.4742929333846937)) ( *  ( +  ( +  sym93 -0.01730768010020256) sym93) 2.090185051399266)) ( *  ( +  ( +  sym94 -0.07829717546701431) sym94) 0.0)) ( *  ( +  ( +  sym95 -0.006144737359136343) sym95) 0.0)) ( *  ( +  ( +  sym96 0.015694094821810722) sym96) 17.293428250896085)) ( *  ( +  ( +  sym97 -0.07766735553741455) sym97) 0.0)) ( *  ( +  ( +  sym98 -0.03613675758242607) sym98) 0.0)) ( *  ( +  ( +  sym99 0.03772144019603729) sym99) 12.112116213250175)) ( *  ( +  ( +  sym100 -0.01558818481862545) sym100) 0.0)) ( *  ( +  ( +  sym101 -0.09158604592084885) sym101) 0.0)) ( *  ( +  ( +  sym102 0.14526450634002686) sym102) 0.0)) ( *  ( +  ( +  sym103 -0.03416677564382553) sym103) 0.0)) ( *  ( +  ( +  sym104 -0.002925879321992397) sym104) 0.0)) ( *  ( +  ( +  sym105 -0.03228799253702164) sym105) 0.0)) ( *  ( +  ( +  sym106 0.010714552365243435) sym106) 0.0)) ( *  ( +  ( +  sym107 0.014705810695886612) sym107) 0.0)) ( *  ( +  ( +  sym108 0.001484977547079325) sym108) 0.0)) ( *  ( +  ( +  sym109 -0.07322600483894348) sym109) 0.670673978609312)) ( *  ( +  ( +  sym110 -0.029959795996546745) sym110) 7.435865309565114)) ( *  ( +  ( +  sym111 0.01339249312877655) sym111) 0.0)) ( *  ( +  ( +  sym112 -0.01368560642004013) sym112) 0.0)) ( *  ( +  ( +  sym113 -0.023846931755542755) sym113) 8.82127426827354)) ( *  ( +  ( +  sym114 -0.029906662181019783) sym114) 0.0)) ( *  ( +  ( +  sym115 0.045675382018089294) sym115) 19.27600643117436)) ( *  ( +  ( +  sym116 0.025146281346678734) sym116) 0.0)) ( *  ( +  ( +  sym117 0.003717476036399603) sym117) 11.936997686356895)) ( *  ( +  ( +  sym118 0.03202390298247337) sym118) 0.0)) ( *  ( +  ( +  sym119 0.06155509501695633) sym119) 3.448659684273895)) ( *  ( +  ( +  sym120 0.0339205376803875) sym120) 0.0)) ( *  ( +  ( +  sym121 0.03581073507666588) sym121) 0.0)) ( *  ( +  ( +  sym122 -0.011569074355065823) sym122) 0.0)) ( *  ( +  ( +  sym123 -0.02473904937505722) sym123) 2.068043088761435)) ( *  ( +  ( +  sym124 -0.021040160208940506) sym124) 0.0)) ( *  ( +  ( +  sym125 -0.01964367739856243) sym125) 0.0)) ( *  ( +  ( +  sym126 0.05224377661943436) sym126) 4.916893866238047)) ( *  ( +  ( +  sym127 -0.025325274094939232) sym127) 0.0))\n" + 
			"-2.2312586376200048\n" + 
			"-0.8352761847536967\n" + 
			"-10.01084590533937\n" + 
			"0.7726694180164138\n" + 
			"-10.074973963408254\n";
	public static void main(String[] args) throws  Exception {
		String inputFile = DNNt.path+"inputs\\inn45.txt";
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
		int label = model.run(a,4);
		System.out.println(DNNt.generatedconstraints);
		assert(DNNt.generatedconstraints.equals(originalconstraints));
		System.out.println("Test 4 Passed");
	}
}
