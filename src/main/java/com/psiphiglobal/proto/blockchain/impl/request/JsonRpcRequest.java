package com.psiphiglobal.proto.blockchain.impl.request;

import com.psiphiglobal.proto._core.Constants;

import java.util.ArrayList;
import java.util.List;

public class JsonRpcRequest
{
    protected final String id;
    protected final String method;
    protected final List<Object> params;
    protected final String chain_name;

    public JsonRpcRequest(String method, List<Object> params)
    {
        this.id = generateRequestId();
        this.method = method;
        this.params = params;
        this.chain_name = Constants.CHAIN_NAME;
    }

    public JsonRpcRequest(String method)
    {
        this(method, new ArrayList<>());
    }

    private static String generateRequestId()
    {
        return System.nanoTime() + "_" + ((int) (10000 * Math.random()));
    }
}
