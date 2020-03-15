package user.api;

import io.restassured.response.Response;

public class UserApi extends BaseApi{
/*   @Test
    public Response get(String userid) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("userid", userid);
        setParams(params);
        return parseMethod();
    }*/


    public Response gettoken() {
        return parseMethod();
    }


    public Response get() {
        return parseMethod();
    }

    public Response create() {
        return parseMethod();
    }


    public Response update() {
        return parseMethod();
    }


    public Response delete() {
        return parseMethod();
    }

    public Response batchdelete() {
        return parseMethod();
    }

    public Response simplelist() {
        return parseMethod();
    }

    public Response list() {
        return parseMethod();
    }

}
