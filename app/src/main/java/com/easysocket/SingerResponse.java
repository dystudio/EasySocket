package com.easysocket;

import com.easysocket.entity.basemsg.BaseSingerResponse;

/**
 * Author：Alex
 * Date：2019/12/7
 * Note：带有回调标识singer的响应消息
 */
public class SingerResponse extends BaseSingerResponse {

    private String from;
    /**
     * 消息ID
     */
    private String msgId;

    @Override
    public String toString() {
        return "SingerResponse{" +
                "from='" + from + '\'' +
                ", msgId='" + msgId + '\'' +
                '}';
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}