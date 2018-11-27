package struts16;

import org.apache.struts.action.ActionForm;

public class ExExceptionForm extends ActionForm{
	private String num1;
	private String num2;
	private int result;

	public void setNum1(String num1) {this.num1 = num1;}
	public String getNum1() {return num1;}
	public void setNum2(String num2) {this.num2 = num2;}
	public String getNum2() {return num2;}
	public void setResult(int result) {this.result = result;}
	public int getResult() {return result;}

}
