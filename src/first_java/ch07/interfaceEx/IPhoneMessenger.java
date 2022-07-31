package first_java.ch07.interfaceEx;

public class IPhoneMessenger implements Messenger{

    @Override
    public String getMessage() {
        return "iphone";
    }

    @Override
    public void setMessage(String msg) {
        System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);
    }

    public void clearMessage() {
        System.out.println("좌우로 흔들어 문자열을 지웁니다.");
    }
}