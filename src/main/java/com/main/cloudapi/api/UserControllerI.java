package com.main.cloudapi.api;

import com.main.cloudapi.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mirxak on 24.01.15.
 */
@RequestMapping(headers = {"Accept=application/json", "Accept=application/v0+json"}, value = "/" + User.CATEGORY)
public interface UserControllerI {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String id);

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers();

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User addUser(@RequestBody String json);

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    @ResponseBody
    public User editUser(@PathVariable String id, @RequestBody String json);

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public User deleteUser(@PathVariable String id);

}
