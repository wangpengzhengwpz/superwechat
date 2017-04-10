package cn.ucai.superwechat.db;

import android.content.Context;

import java.io.File;

/**
 * Created by w on 2017/4/10.
 */

public interface IGroupModel {
    void newGroup(Context context, String hxid, String groupName, String description, String owner,
                  boolean isPublic, boolean isInvites, File file,
                  OnCompleteListener<String> listener);
}