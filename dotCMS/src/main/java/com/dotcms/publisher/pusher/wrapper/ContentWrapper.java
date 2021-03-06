package com.dotcms.publisher.pusher.wrapper;

import com.dotcms.publisher.pusher.PushPublisherConfig.Operation;
import com.dotmarketing.portlets.contentlet.model.Contentlet;
import com.dotmarketing.portlets.contentlet.model.ContentletVersionInfo;
import com.dotmarketing.portlets.languagesmanager.model.Language;
import com.dotmarketing.tag.model.Tag;

import java.util.List;
import java.util.Map;

public interface ContentWrapper {

    Contentlet getContent ();

    List<Map<String, Object>> getTree ();

    List<Map<String, Object>> getMultiTree ();

    List<Tag> getTags ();

    Operation getOperation ();

    ContentletVersionInfo getInfo ();

    Language getLanguage();

    Map<String, List<Tag>> getContentTags();

}