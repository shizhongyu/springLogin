package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controllerע����뱾Java��
//��controller���Ʋ�
@Controller
public class Login {
	// ͨ��@RequestMappingע�����
	// ��ָ����URL·�����ʱ����Ʋ�
	@RequestMapping("/login")
	// @RequestParamע��Ĺ��ܴ�url���ݲ�����ȡ�ò���ֵ
	// Model model�������൱����request�����з�������
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		if (username.equals("ghy") && password.equals("123")) {
			model.addAttribute("username", username);
			return "ok.jsp";
		} else {
			return "no.jsp";
		}
	}
}

