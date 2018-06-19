package www.george.com.myEnum;

public enum UserState {
    /*
     ** 0表示注册成功， 但仍需要邮件激活
     *  1表示账号已经存在， 需要激活
     *  2表示账号存在，且已经激活
     */
    USER_UN_ACTIVE(0),
    USER_EXIST_UN_ACTIVE(1),
    USER_EXIST_ACTIVE(2);

    private final int state;

    private UserState(final int state){
        this.state = state;
    }

    public int getState(){
        return state;
    }
}
