package struts16;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class ExExceptionAction extends Action{
	public ActionForward execute(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) {

		// formキャストしてアクションフォームbeanのオブジェクト取得
		ExExceptionForm eef = (ExExceptionForm)form;

		String num1 = eef.getNum1();
		String num2 = eef.getNum2();

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);

		int result = a / b;

		eef.setResult(result);
		return (mapping.findForward("calc"));
	}
}
