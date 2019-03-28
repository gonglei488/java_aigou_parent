package cn.gonglei.aigou.common;

public class AjaxResult {
    private boolean success=true;
    private String msg="操作成功";
    private Object object=null;

    public static void main(String[] args) {
    AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject("异常错误了");
    }
    public static AjaxResult me(){
        return new AjaxResult();
    }
    public AjaxResult(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public AjaxResult() {
    }

    public AjaxResult(boolean success, String msg, Object object) {
        this.success = success;
        this.msg = msg;
        this.object = object;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
