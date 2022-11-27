//아래 코드를 조건에 맞게 구현하세요. 필요시 코드를 수정해야 합니다.

abstract class PhoneConnection {
    protected String sender, receiver;

    public PhoneConnection(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public PhoneConnection() {
        this("unknown", "unknown");
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public abstract int computeTotalFee();
}

class Message extends PhoneConnection {
    private int lenOfText;
    private static int totalMessages = 0;

    public Message(String sender, String receiver, int lenOfText) {
        super(sender, receiver);
        this.lenOfText = lenOfText;
        Message.totalMessages++;
    }

    public Message() {
        this("unknown", "unknown", 0);
    }

    public int getLenOfText() {
        return this.lenOfText;
    }

    public void setLenOfText(int lenOfText) {
        this.lenOfText = lenOfText;
    }

    public static int getTotalMessages() {
        return Message.totalMessages;
    }

    public static void setTotalMessages(int totalMessages) {
        Message.totalMessages = totalMessages;
    }

    @Override
    public int computeTotalFee() {
        return Message.totalMessages * 3;
    }
}

class Call extends PhoneConnection {
    private int callTime;
    private static int totalCallTime = 0;

    public Call(String sender, String receiver, int callTime) {
        super(sender, receiver);
        this.callTime = callTime;
        Call.totalCallTime += callTime;
    }

    public Call() {
        this("unknown", "unknown", 0);
    }

    public int getCallTime() {
        return this.callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    public static int getTotalCallTime() {
        return Call.totalCallTime;
    }

    public static void setTotalCallTime(int totalCallTime) {
        Call.totalCallTime = totalCallTime;
    }

    @Override
    public int computeTotalFee() {
        return Call.totalCallTime * 10;
    }
}

// 아래 코드는 수정하지 마세요.
class Solution {
    public static int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}