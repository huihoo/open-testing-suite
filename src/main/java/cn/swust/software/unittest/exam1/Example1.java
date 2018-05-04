package cn.swust.software.unittest.exam1;

public class Example1 {
	public Addition addition = new Addition();
	public Cutstring cut = new Cutstring();
	/**
	 * @param sentence 例如 "2/1 3/2 5/3 8/5 13/8 21/13"
	 */
	public double fun(String sentence) { 
	 
		String[] list = cut.cutString(sentence);
		
		for (int i = 0; i < list.length; i++) {
			addition.add(cut.fraction(list[i]));
		}
		return addition.getSum();
	} 
}
