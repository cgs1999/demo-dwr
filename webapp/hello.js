function hello(){
	var user = $('user').value;
	Hello.sayHello(user,callback);
}
function callback(msg){
	DWRUtil.setValue('result',msg);
}


function login(){
	var username=dwr.util.getValue("username");
	var password=dwr.util.getValue("password");
	UserService.isLogin(username,password,function(isLogin){
		if(isLogin)
			location.href="list.jsp"; //(博客不支持,应该为location)
		else{
			alert("用户名或密码错误");
			return false;
		}
	});
}