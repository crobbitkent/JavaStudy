package org.kiosk.server.task;

import java.io.DataOutputStream;

import com.google.gson.JsonElement;

public interface Task {

	void runTask(JsonElement req, DataOutputStream dos)throws Exception;
}
