package io.github.bakedlibs.dough.versions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.annotation.Nonnull;

/**
 * Get dough's version and other related information.
 *
 * @author womzil
 *
 */
public final class DoughVersion {
    private static final Properties props = loadProperties();

    private static final String VERSION = props.getProperty("version", "UNKNOWN");
    private static final String BRANCH = props.getProperty("branch", "UNKNOWN");
    private static final String COMMIT_ABBREV = props.getProperty("commit.id.abbrev", "UNKNOWN");
    private static final String COMMIT_FULL = props.getProperty("commit.id.full", "UNKNOWN");

    @Nonnull
    public static String getVersion() {
        return VERSION;
    }

    @Nonnull
    public static String getBranch() {
        return BRANCH;
    }

    @Nonnull
    public static String getCommit() {
        return COMMIT_ABBREV;
    }

    @Nonnull
    public static String getCommitFull() {
        return COMMIT_FULL;
    }

    private static Properties loadProperties() {
        try (InputStream in = DoughVersion.class.getResourceAsStream("/dough.properties")) {
            Properties p = new Properties();
            if (in != null) p.load(in);
            return p;
        } catch (IOException e) {
            return new Properties();
        }
    }
}