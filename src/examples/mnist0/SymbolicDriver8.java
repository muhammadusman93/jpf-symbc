package mnist0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import gov.nasa.jpf.symbc.Debug;
import gov.nasa.jpf.symbc.DNN;
import gov.nasa.jpf.symbc.DNNDataGeneralize;
import gov.nasa.jpf.symbc.DNNGeneralize;
public class SymbolicDriver8 {
	static final int IMG_HEIGHT = 28;
	static final int IMG_WIDTH = 28; 
	static String originalconstraints="-1.1881219594254167\n" + 
			"-3.1821762812775845\n" + 
			"1.9844263466141747\n" + 
			"1.4625323915487776\n" + 
			"0.20904073861074682\n" + 
			"5.494820552888734\n" + 
			"-3.324098640710524\n" + 
			"-9.871151079521624\n" + 
			"( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( +  ( *  ( +  ( +  sym0 -0.003526338608935475) sym0) 0.0) -0.01326112449169159) ( *  ( +  ( +  sym1 -0.01093368325382471) sym1) 0.0)) ( *  ( +  ( +  sym2 0.03081444464623928) sym2) 4.4608782982572475)) ( *  ( +  ( +  sym3 -0.07680407911539078) sym3) 2.2994913263103802)) ( *  ( +  ( +  sym4 -0.007730477023869753) sym4) 0.0)) ( *  ( +  ( +  sym5 -0.017685992643237114) sym5) 0.0)) ( *  ( +  ( +  sym6 -0.036449555307626724) sym6) 0.0)) ( *  ( +  ( +  sym7 0.04292106255888939) sym7) 16.051394397369023)) ( *  ( +  ( +  sym8 0.00948352925479412) sym8) 4.998944636297958)) ( *  ( +  ( +  sym9 0.012604624964296818) sym9) 0.0)) ( *  ( +  ( +  sym10 0.006109198555350304) sym10) 25.323648683507862)) ( *  ( +  ( +  sym11 -0.057962097227573395) sym11) 0.0)) ( *  ( +  ( +  sym12 0.02684619650244713) sym12) 0.0)) ( *  ( +  ( +  sym13 -0.05091032385826111) sym13) 0.0)) ( *  ( +  ( +  sym14 -0.10712794214487076) sym14) 5.987951404594703)) ( *  ( +  ( +  sym15 0.0219630915671587) sym15) 11.922486362639187)) ( *  ( +  ( +  sym16 -0.004418049473315477) sym16) 13.80019500698529)) ( *  ( +  ( +  sym17 -0.0419522225856781) sym17) 6.3692336574944886)) ( *  ( +  ( +  sym18 -0.00464775413274765) sym18) 8.881945412128495)) ( *  ( +  ( +  sym19 -0.026600176468491554) sym19) 0.0)) ( *  ( +  ( +  sym20 0.030933376401662827) sym20) 22.463633281379856)) ( *  ( +  ( +  sym21 0.001440849038772285) sym21) 0.0)) ( *  ( +  ( +  sym22 0.032971639186143875) sym22) 0.0)) ( *  ( +  ( +  sym23 0.05720912665128708) sym23) 13.625770843711527)) ( *  ( +  ( +  sym24 0.015363633632659912) sym24) 10.477543806038092)) ( *  ( +  ( +  sym25 -0.1399211436510086) sym25) 0.0)) ( *  ( +  ( +  sym26 -0.038837794214487076) sym26) 10.174763993609306)) ( *  ( +  ( +  sym27 -0.04731700196862221) sym27) 0.0)) ( *  ( +  ( +  sym28 -0.011582793667912483) sym28) 0.0)) ( *  ( +  ( +  sym29 -0.020788753405213356) sym29) 3.818771956209489)) ( *  ( +  ( +  sym30 0.02959357760846615) sym30) 17.888057320668185)) ( *  ( +  ( +  sym31 0.04523621127009392) sym31) 10.117906890463217)) ( *  ( +  ( +  sym32 0.05312998220324516) sym32) 11.194189195737781)) ( *  ( +  ( +  sym33 0.02790258079767227) sym33) 0.0)) ( *  ( +  ( +  sym34 -0.04395536333322525) sym34) 5.6350654135682685)) ( *  ( +  ( +  sym35 -0.023329993709921837) sym35) 0.04362767463831668)) ( *  ( +  ( +  sym36 -0.06263263523578644) sym36) 0.0)) ( *  ( +  ( +  sym37 0.04071445018053055) sym37) 16.32802065777461)) ( *  ( +  ( +  sym38 0.006238623987883329) sym38) 0.0)) ( *  ( +  ( +  sym39 0.026769638061523438) sym39) 0.0)) ( *  ( +  ( +  sym40 -0.09132583439350128) sym40) 0.0)) ( *  ( +  ( +  sym41 -0.009121070615947247) sym41) 0.0)) ( *  ( +  ( +  sym42 -0.000310824194457382) sym42) 6.042798828789867)) ( *  ( +  ( +  sym43 -0.009251323528587818) sym43) 4.645900424247941)) ( *  ( +  ( +  sym44 -0.0361027829349041) sym44) 0.0)) ( *  ( +  ( +  sym45 0.016744568943977356) sym45) 0.0)) ( *  ( +  ( +  sym46 -0.050827234983444214) sym46) 0.0)) ( *  ( +  ( +  sym47 -0.03151879459619522) sym47) 0.0)) ( *  ( +  ( +  sym48 -0.003055865410715342) sym48) 0.0)) ( *  ( +  ( +  sym49 0.003672041464596987) sym49) 1.2109857331713552)) ( *  ( +  ( +  sym50 -0.028146078810095787) sym50) 0.0)) ( *  ( +  ( +  sym51 0.013278794474899769) sym51) 9.383982687298323)) ( *  ( +  ( +  sym52 -0.07304076850414276) sym52) 0.0)) ( *  ( +  ( +  sym53 -0.01037757657468319) sym53) 0.0)) ( *  ( +  ( +  sym54 0.027353839948773384) sym54) 16.936745753044775)) ( *  ( +  ( +  sym55 -0.043856069445610046) sym55) 9.27486300678391)) ( *  ( +  ( +  sym56 -0.006753096356987953) sym56) 0.0)) ( *  ( +  ( +  sym57 0.03367691487073898) sym57) 0.0)) ( *  ( +  ( +  sym58 -0.034655869007110596) sym58) 0.0)) ( *  ( +  ( +  sym59 -0.018313592299818993) sym59) 0.0)) ( *  ( +  ( +  sym60 0.03142616152763367) sym60) 0.0)) ( *  ( +  ( +  sym61 -0.027546897530555725) sym61) 0.0)) ( *  ( +  ( +  sym62 0.011054101400077343) sym62) 0.0)) ( *  ( +  ( +  sym63 0.012178810313344002) sym63) 0.0)) ( *  ( +  ( +  sym64 -0.06425158679485321) sym64) 16.257754404435367)) ( *  ( +  ( +  sym65 -0.049703244119882584) sym65) 0.0)) ( *  ( +  ( +  sym66 -0.08050204813480377) sym66) 0.0)) ( *  ( +  ( +  sym67 -0.05470488220453262) sym67) 0.0)) ( *  ( +  ( +  sym68 0.03823060169816017) sym68) 0.6213686343384313)) ( *  ( +  ( +  sym69 -0.06899462640285492) sym69) 0.4960778103219716)) ( *  ( +  ( +  sym70 -0.03959120810031891) sym70) 0.0)) ( *  ( +  ( +  sym71 0.000341838545864448) sym71) 11.610086816348987)) ( *  ( +  ( +  sym72 -0.006830474827438593) sym72) 0.0)) ( *  ( +  ( +  sym73 -0.12095397710800171) sym73) 0.0)) ( *  ( +  ( +  sym74 -0.002228537341579795) sym74) 11.603254248773926)) ( *  ( +  ( +  sym75 0.04493769258260727) sym75) 7.260595881920951)) ( *  ( +  ( +  sym76 -0.04195224866271019) sym76) 3.1986774770979265)) ( *  ( +  ( +  sym77 0.02247432991862297) sym77) 0.0)) ( *  ( +  ( +  sym78 0.047978319227695465) sym78) 9.595309020051907)) ( *  ( +  ( +  sym79 -0.024640461429953575) sym79) 0.0)) ( *  ( +  ( +  sym80 0.028553318232297897) sym80) 1.8359937209266142)) ( *  ( +  ( +  sym81 0.030787542462348938) sym81) 4.147014330006006)) ( *  ( +  ( +  sym82 0.002293700817972422) sym82) 12.085488465979875)) ( *  ( +  ( +  sym83 0.019809218123555183) sym83) 2.864960621651674)) ( *  ( +  ( +  sym84 -0.014141824096441269) sym84) 0.0)) ( *  ( +  ( +  sym85 0.004468960221856833) sym85) 11.083628190589328)) ( *  ( +  ( +  sym86 -0.003013768000528216) sym86) 0.0)) ( *  ( +  ( +  sym87 -0.02732478640973568) sym87) 0.0)) ( *  ( +  ( +  sym88 -0.013465392403304577) sym88) 0.0)) ( *  ( +  ( +  sym89 0.01949206553399563) sym89) 0.9645563379373959)) ( *  ( +  ( +  sym90 0.024964749813079834) sym90) 0.0)) ( *  ( +  ( +  sym91 0.014621446840465069) sym91) 0.1206107562890747)) ( *  ( +  ( +  sym92 0.030124805867671967) sym92) 7.281538286191067)) ( *  ( +  ( +  sym93 0.001864910940639675) sym93) 2.2884688426542485)) ( *  ( +  ( +  sym94 0.041947443038225174) sym94) 1.2634381554072838)) ( *  ( +  ( +  sym95 0.023299966007471085) sym95) 0.0)) ( *  ( +  ( +  sym96 0.014954923652112484) sym96) 0.0)) ( *  ( +  ( +  sym97 -0.02603231556713581) sym97) 0.0)) ( *  ( +  ( +  sym98 0.000029548216843978) sym98) 0.0)) ( *  ( +  ( +  sym99 0.014205297455191612) sym99) 5.666734535104371)) ( *  ( +  ( +  sym100 -0.032963745296001434) sym100) 12.76510855341448)) ( *  ( +  ( +  sym101 -0.013464254327118397) sym101) 0.0)) ( *  ( +  ( +  sym102 0.06907815486192703) sym102) 0.0)) ( *  ( +  ( +  sym103 -0.03416062891483307) sym103) 0.0)) ( *  ( +  ( +  sym104 -0.05559442937374115) sym104) 0.0)) ( *  ( +  ( +  sym105 -0.002160171279683709) sym105) 0.6340132547978284)) ( *  ( +  ( +  sym106 -0.05354246124625206) sym106) 0.0)) ( *  ( +  ( +  sym107 -0.040300190448760986) sym107) 0.0)) ( *  ( +  ( +  sym108 0.04654017090797424) sym108) 0.0)) ( *  ( +  ( +  sym109 0.014576945453882217) sym109) 4.089404441828268)) ( *  ( +  ( +  sym110 -0.0554022490978241) sym110) 7.128293285137918)) ( *  ( +  ( +  sym111 0.03548811376094818) sym111) 0.0)) ( *  ( +  ( +  sym112 0.028125571087002754) sym112) 0.0)) ( *  ( +  ( +  sym113 0.026193542405962944) sym113) 12.307658787714564)) ( *  ( +  ( +  sym114 -0.029679352417588234) sym114) 13.462463693025024)) ( *  ( +  ( +  sym115 0.05625033751130104) sym115) 12.079239967165458)) ( *  ( +  ( +  sym116 -0.08052268624305725) sym116) 0.0)) ( *  ( +  ( +  sym117 0.03899143636226654) sym117) 13.406591998456161)) ( *  ( +  ( +  sym118 0.029659457504749298) sym118) 0.0)) ( *  ( +  ( +  sym119 0.025499429553747177) sym119) 5.350183967472406)) ( *  ( +  ( +  sym120 -0.04157271981239319) sym120) 0.0)) ( *  ( +  ( +  sym121 -0.08761051297187805) sym121) 0.0)) ( *  ( +  ( +  sym122 -0.055690109729766846) sym122) 5.787020512140701)) ( *  ( +  ( +  sym123 -0.029488109052181244) sym123) 2.039961168961271)) ( *  ( +  ( +  sym124 -0.012422534637153149) sym124) 0.0)) ( *  ( +  ( +  sym125 -0.05077061429619789) sym125) 0.0)) ( *  ( +  ( +  sym126 -0.03879718482494354) sym126) 14.094421952275173)) ( *  ( +  ( +  sym127 0.043565187603235245) sym127) 1.0572751004660987))\n" + 
			"-3.542128171549592\n";
	public static void main(String[] args) throws  Exception {
		String inputFile = DNNt.path+"inputs\\inn85.txt";
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
		int label = model.run(a,8);
		System.out.println(DNNt.generatedconstraints);
		assert(DNNt.generatedconstraints.equals(originalconstraints));
		System.out.println("Test 8 Passed");
	}
}