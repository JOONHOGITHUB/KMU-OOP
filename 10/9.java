//아래 코드를 조건에 맞게 구현하되, 필요 하다면 코드를 수정하세요.
abstract class BaseBrowser {
    protected String nowUrl;

    public BaseBrowser(String nowUrl) {
        this.nowUrl = nowUrl;
    }

    public BaseBrowser() {
        this("");
    }

    public String getNowUrl() {
        return this.nowUrl;
    }

    public abstract void setNowUrl(String nowUrl);

    public abstract String toHome();
}

class OldBrowser extends BaseBrowser {
    protected String prevUrl;

    public OldBrowser(String nowUrl) {
        super(nowUrl);
        this.prevUrl = "";
    }

    public OldBrowser() {
        this("");
    }

    public String getPrevUrl() {
        return this.prevUrl;
    }

    public boolean toPrev() {
        if (this.prevUrl.equals(""))
            return false;
        this.nowUrl = this.prevUrl;
        this.prevUrl = "";
        return true;
    }

    @Override
    public void setNowUrl(String nowUrl) {
        this.prevUrl = this.nowUrl;
        this.nowUrl = nowUrl;
    }

    @Override
    public String toHome() {
        this.prevUrl = this.nowUrl;
        this.nowUrl = "";
        return this.nowUrl;
    }
}

class NewBrowser extends BaseBrowser {
    protected String prevUrl, nextUrl;

    public NewBrowser(String nowUrl) {
        super(nowUrl);
        this.prevUrl = "";
        this.nextUrl = "";
    }

    public NewBrowser() {
        this("/home");
    }

    public String getPrevUrl() {
        return this.prevUrl;
    }

    public String getNextUrl() {
        return this.nextUrl;
    }

    public boolean toPrev() {
        if (this.prevUrl.equals(""))
            return false;
        this.nextUrl = this.nowUrl;
        this.nowUrl = this.prevUrl;
        this.prevUrl = "";
        return true;
    }

    public boolean toNext() {
        if (this.nextUrl.equals(""))
            return false;
        this.prevUrl = this.nowUrl;
        this.nowUrl = this.nextUrl;
        this.nextUrl = "";
        return true;
    }

    @Override
    public void setNowUrl(String nowUrl) {
        this.prevUrl = this.nowUrl;
        this.nowUrl = nowUrl;
        this.nextUrl = "";
    }

    @Override
    public String toHome() {
        this.prevUrl = this.nowUrl;
        this.nowUrl = "/home";
        this.nextUrl = "";
        return this.nowUrl;
    }
}

// 아래 코드는 수정하지 마세요
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}