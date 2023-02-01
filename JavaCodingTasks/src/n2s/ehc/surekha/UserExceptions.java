package n2s.ehc.surekha;

class InvalidUserId extends Exception{
	InvalidUserId(String msg){
		System.err.println(msg);
	}
}

class UserIdNotFound extends Exception{
	UserIdNotFound(String msg){
		System.err.println(msg);
	}
}

class InvalidEntry extends Exception{
	InvalidEntry(String msg){
		System.err.println(msg);
	}
}
