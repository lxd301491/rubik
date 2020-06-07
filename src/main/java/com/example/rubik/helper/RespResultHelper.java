package com.example.rubik.helper;

import com.example.rubik.bean.RespResult;
import com.example.rubik.bean.RespResultConstant;
import org.apache.ibatis.jdbc.Null;

public class RespResultHelper {
    public static RespResult<Null> success() {
        return success(null);
    }

    public static<T> RespResult<T> success(T data) {
        return new RespResult<T>(RespResultConstant.SUCCESS, data);
    }

    public static RespResult<Null> failed() {
        return new RespResult<Null>(RespResultConstant.FAILED, null);
    }
}
