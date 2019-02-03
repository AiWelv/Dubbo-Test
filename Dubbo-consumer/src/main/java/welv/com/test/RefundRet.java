package welv.com.test;

/**
 * Created by lvyj on 2017/12/26.
 */
public class RefundRet {

    private String MERCHANTID;
    private String       ORDNUM;
    private String  ORDDATE;
    private String          REFUNDNO;
    private String  PAYMENT;
    private String         REFUNDSTATE;
    private String   FAILMSG;
    private String       SIGN;

    public String getMERCHANTID() {
        return MERCHANTID;
    }

    public void setMERCHANTID(String MERCHANTID) {
        this.MERCHANTID = MERCHANTID;
    }

    public String getORDNUM() {
        return ORDNUM;
    }

    public void setORDNUM(String ORDNUM) {
        this.ORDNUM = ORDNUM;
    }

    public String getORDDATE() {
        return ORDDATE;
    }

    public void setORDDATE(String ORDDATE) {
        this.ORDDATE = ORDDATE;
    }

    public String getREFUNDNO() {
        return REFUNDNO;
    }

    public void setREFUNDNO(String REFUNDNO) {
        this.REFUNDNO = REFUNDNO;
    }

    public String getPAYMENT() {
        return PAYMENT;
    }

    public void setPAYMENT(String PAYMENT) {
        this.PAYMENT = PAYMENT;
    }

    public String getREFUNDSTATE() {
        return REFUNDSTATE;
    }

    public void setREFUNDSTATE(String REFUNDSTATE) {
        this.REFUNDSTATE = REFUNDSTATE;
    }

    public String getFAILMSG() {
        return FAILMSG;
    }

    public void setFAILMSG(String FAILMSG) {
        this.FAILMSG = FAILMSG;
    }

    public String getSIGN() {
        return SIGN;
    }

    public void setSIGN(String SIGN) {
        this.SIGN = SIGN;
    }
}
