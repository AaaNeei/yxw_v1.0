package com.yxw.web.interceptor;

import com.sun.istack.internal.logging.Logger;
import com.yxw.web.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author:阿倪
 * @Date: 2019/3/12 21:54
 * @Description:
 * @return:
 * @throws:
 */
@Component
@Controller
public class LoginInterceptor extends HandlerInterceptorAdapter {


    Logger log = Logger.getLogger(LoginInterceptor.class);

	/*@Autowired
	UserService userService;*/

	/*@Value("${IGNORE_LOGIN}")
	Boolean IGNORE_LOGIN;*/

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String basePath = request.getContextPath();
        String path = request.getRequestURI();
//		log.info("basePath:"+basePath);
//		log.info("path:"+path);

        //是否进行登陆拦截
        if (!doLoginInterceptor(path, basePath)) {
            return true;
        }

//		HttpSession session = request.getSession();
//		int userID = 2;
//		UserInfo userInfo = sysUserService.getUserInfoByUserID(userID);
//		System.out.println(JsonUtil.toJson(userInfo));
//		session.setAttribute(Constants.SessionKey.USER, userInfo);

        //如果登录了，会把用户信息存进session
        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("login");
		/*User userInfo = new User();
		userInfo.setId(users.get(0).getId());
		userInfo.setName(users.get(0).getName());
		userInfo.setPassword(users.get(0).getPassword());*/
        //开发环节的设置，不登录的情况下自动登录
		/*if(userInfo==null && IGNORE_LOGIN){
			userInfo = sysUserService.getUserInfoByUserID(2);
			session.setAttribute(Constants.SessionKey.USER, userInfo);
		}*/
       /* if (student == null) {


            String requestType = request.getHeader("X-Requested-With");
            if (requestType != null && requestType.equals("XMLHttpRequest")) {
                response.setHeader("sessionstatus", "timeout");
                response.getWriter().print("LoginTimeout");
                return false;
            } else {
                log.info("尚未登录，跳转到登录界面");
                response.sendRedirect(request.getContextPath() + "/yxw/login");
            }
            return false;
        }
        log.info("用户已登录,userName:" + student.getStuUsername());*/
        return true;
    }

    /**
     * 是否进行登陆过滤
     *
     * @param path
     * @param basePath
     * @return
     */
    private boolean doLoginInterceptor(String path, String basePath) {
        path = path.substring(basePath.length());
        Set<String> notLoginPaths = new HashSet<>();
        //设置不进行登录拦截的路径：登录注册和验证码
        notLoginPaths.add("/**");
        notLoginPaths.add("/top");
        notLoginPaths.add("/yxw/index");
        notLoginPaths.add("/footer");
        notLoginPaths.add("/yxw/login");
        notLoginPaths.add("/yxw/loginIn");
        notLoginPaths.add("/yxw/register");
        notLoginPaths.add("/kaptcha.jpg");
        notLoginPaths.add("/yxw/loginOut");
        notLoginPaths.add("/yxw/registerIn");
        notLoginPaths.add("/yxw/register_getSchoolByProvinceNum.json");
        notLoginPaths.add("/yxw/ajaxCheckStuUsername.json");
        notLoginPaths.add("/yxw/ajaxCheckMobileCode.json");
        //notLoginPaths.add("/loginTimeout");

        if (notLoginPaths.contains(path)) {
            return false;
        }
        return true;
    }


}
