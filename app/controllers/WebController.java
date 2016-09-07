package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.web.*;
import views.html.web.loginSignup.*;

public class WebController extends Controller{
	
	// 首頁
	public Result index(){
		return ok(index.render());
	}
	
	// 登入
	public Result login(){
		return ok(login.render());
	}
	
	// 註冊
	public Result signup(){
		return ok(signup.render());
	}
}
