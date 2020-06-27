package org.zzy.lib.redline;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import org.zzy.lib.redline.detector.MessageObtainDetector;
import org.zzy.lib.redline.detector.SerializableDetector;
import org.zzy.lib.redline.detector.ThreadDetector;
import org.zzy.lib.redline.detector.ViewIDPrefixDetector;

import java.util.Arrays;
import java.util.List;

/**
 * ================================================
 * 作    者：ZhouZhengyi
 * 创建日期：2020/6/18 9:49
 * 描    述：自定义lint注册中心
 * 修订历史：
 * ================================================
 */
public class RegistryCenter extends IssueRegistry {


    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(MessageObtainDetector.ISSUE,
                ViewIDPrefixDetector.ISSUE,
                ThreadDetector.ISSUE,
                SerializableDetector.ISSUE
        );
    }


}
