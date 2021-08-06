package com.nxzzld.nothingappication.interface_model;

import android.util.Log;

public class BModel implements Huidiao{



    private CModel cModel;

    public BModel(CModel cModel) {
        this.cModel = cModel;
    }


    public void DoEvent(){
        Log.d("TAG", "DOEvent: 触发事件");
        cModel.doSomething(this);
    }

    @Override
    public void backMethod() {

        Log.d("TAG", "backMethod: "+"最后B响应");

    }
}
