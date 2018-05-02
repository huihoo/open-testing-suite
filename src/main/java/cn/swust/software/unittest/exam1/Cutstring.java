package cn.swust.software.unittest.exam1;

public class Cutstring {
	public String[] cutString(String Stence) {
		String[] str = Stence.split(" ");
		return str;
	}
	 
	public double fraction(String fractionstr) {
		int pos = 0;
		for (int i = 0; i < fractionstr.length(); i++) {
			if (fractionstr.charAt(i) == '/') {
				pos = i;
			}
		}
		String molecule = fractionstr.substring(0, pos);
		String denominator = fractionstr.substring(pos + 1, fractionstr.length());
		double value = Double.parseDouble(molecule) / Double.parseDouble(denominator);
		return value;
	}
	
}
