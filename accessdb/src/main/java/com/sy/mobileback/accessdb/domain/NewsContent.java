package com.sy.mobileback.accessdb.domain;

/**
 * @author shiyu
 * @Description
 * @create 2019-03-18 20:31
 */
public class NewsContent {

    private String N_Id;
    /**
     * 内容
     */
    private String N_Content;

    public String getN_Id() {
        return N_Id;
    }

    public void setN_Id(String n_Id) {
        N_Id = n_Id;
    }

    public String getN_Content() {
        return N_Content;
    }

    public void setN_Content(String n_Content) {
        N_Content = n_Content;
    }
}
