package com.moohee.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.moohee.board.dao.BDao;
import com.moohee.board.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		//model�ȿ� �ִ� request ��ü�� �������� Map �������� ���� �� Map�� Ű���� request�� request��ü�� ��
		
		String bid = request.getParameter("bid");
		
		BDao dao = new BDao();
		BDto dto = dao.content_view(bid);
		
		model.addAttribute("content", dto);

	}

}
