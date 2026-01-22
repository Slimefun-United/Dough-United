# :bagel: Dough United

<hr />
<p align="center">
    <a href="https://github.com/Slimefun-United/Dough-United/actions">
        <img alt="Build Status" src="https://github.com/Slimefun-United/Dough-United/actions/workflows/maven.yml/badge.svg?event=push" />
    </a>
    <a href="https://javadoc.io/doc/io.github.slimefun-united/dough-api">
	<img alt="javadocs" src="https://javadoc.io/badge2/io.github.slimefun-united/dough-api/javadoc.svg" />
    </a>
    <a href="https://sonarcloud.io/project/overview?id=slimefun-united_dough-united">
        <img alt="Code Coverage" src="https://sonarcloud.io/api/project_badges/measure?project=slimefun-united_dough-united&metric=coverage" />
    </a>
    <a href="https://sonarcloud.io/project/overview?id=slimefun-united_dough-united">
        <img alt="Maintainability" src="https://sonarcloud.io/api/project_badges/measure?project=slimefun-united_dough-united&metric=sqale_rating" />
    </a>
    <a href="https://search.maven.org/search?q=slimefun-united">
        <img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.slimefun-united/dough-united?color=1074ad&logo=apache-maven" />
    </a>
    <a href="https://jitpack.io/#Slimefun-United/Dough-United">
        <img alt="JitPack" src="https://jitpack.io/v/Slimefun-United/Dough-United.svg" />
    </a>
</p>
<hr />

Dough United is a modern continuation of abandoned dough, which was used by the official version of Slimefun and still is used by the Gugu Project's one.
Formerly known simply as "dough" or even earlier as "cs-corelib2", Dough United is a very powerful library aiming to help the everyday Spigot/Paper plugin developer.
It is packed to the brim with useful features and APIs to use and play around with.
It also serves as a drop-in replacement for previous versions of dough (both 1.2 and 1.3!). 

Dough United may be more commonly known as the backbone of [Slimefun United](https://github.com/Slimefun-United/Slimefun-United), just like in the past dough was of the original [Slimefun](https://github.com/Slimefun/Slimefun4).

## :page_facing_up: Table of contents
1. [Getting Started](#mag-getting-started)
    - [Adding dough via gradle](#adding-dough-via-gradle)
    - [Adding dough via Maven](#adding-dough-via-maven)
2. [Features & Documentation](#sparkles-features-and-documentation)
    - TODO
3. [Discord server](#headphones-discord-server)

## :mag: Getting Started
Releases of Dough United are hosted on Maven Central (OSS Sonatype) for easy access.
Furthermore, it consists of multiple different submodules.
Snapshots are available only on JitPack.
You should use release versions whenever possible though.

**Note**: JitPack requires a different artefact ID and JitPack repo!

If you want to utilise the entirety of Dough United, use the artifact `dough-api`.<br>
Otherwise replace `dough-api` in the following examples with whatever module you want to import. Note that
some modules have dependencies on other modules, all modules require `dough-common` as an example.

Dough United can easily be included in Gradle and Maven using Maven Central or JitPack.

### Adding Dough United via Gradle (Groovy)

Simply replace `[DOUGH VERSION]` with the most up-to-date version of Dough United: <br />
![Maven Central](https://img.shields.io/maven-central/v/io.github.slimefun-united/dough?label=latest%20version)
[![](https://jitpack.io/v/Slimefun-United/Dough-United.svg)](https://jitpack.io/#Slimefun-United/Dough-United)

#### Maven Central - releases

```groovy
repositories {
   mavenCentral()
}

dependencies {
   implementation 'io.github.slimefun-united:dough-api:[DOUGH VERSION]'
}
```

#### JitPack - snapshots

```groovy
repositories {
   maven { url 'https://jitpack.io' }
}

dependencies {
   implementation 'com.github.Slimefun-United.Dough-United:dough-api:[DOUGH VERSION]'
}
```

To shadow Dough United and relocate it:
```groovy
plugins {
   id "com.github.johnrengelman.shadow" version "7.0.0"
}

shadowJar {
   relocate "io.github.bakedlibs.dough", "[YOUR PACKAGE].dough"
}
```

### Adding Dough United via Gradle (Kotlin)

Simply replace `[DOUGH VERSION]` with the most up-to-date version of Dough United: <br />
![Maven Central](https://img.shields.io/maven-central/v/io.github.slimefun-united/dough?label=latest%20version)
[![](https://jitpack.io/v/Slimefun-United/Dough-United.svg)](https://jitpack.io/#Slimefun-United/Dough-United)

#### Maven Central - releases

```kotlin
repositories {
   mavenCentral()
}

dependencies {
   implementation("io.github.slimefun-united:dough-api:[DOUGH VERSION]")
}
```

#### JitPack - snapshots

```kotlin
repositories {
   maven("https://jitpack.io")
}

dependencies {
   implementation("com.github.Slimefun-United.Dough-United:dough-api:[DOUGH VERSION]")
}
```

To shadow Dough United and relocate it:
```kotlin
plugins {
   id("com.github.johnrengelman.shadow") version "7.0.0"
}

tasks.shadowJar {
   relocate("io.github.bakedlibs.dough", "[YOUR PACKAGE].dough")
}
```

### Adding Dough United via Maven

Simply replace `[DOUGH VERSION]` with the most up-to-date version of Dough United: <br />
![Maven Central](https://img.shields.io/maven-central/v/io.github.slimefun-united/dough?label=latest%20version)
[![](https://jitpack.io/v/Slimefun-United/Dough-United.svg)](https://jitpack.io/#Slimefun-United/Dough-United)

#### Maven Central - releases

```xml
<dependencies>
  <dependency>
    <groupId>io.github.slimefun-united</groupId>
    <artifactId>dough-api</artifactId>
    <version>[DOUGH VERSION]</version>
    <scope>compile</scope>
  </dependency>
</dependencies>
```

#### JitPack - snapshots

```xml
<repositories>
   <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
   </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.github.Slimefun-United.Dough-United</groupId>
    <artifactId>dough-api</artifactId>
    <version>[DOUGH VERSION]</version>
    <scope>compile</scope>
  </dependency>
</dependencies>
```

To shadow Dough United and relocate it:
```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-shade-plugin</artifactId>
      <version>3.2.4</version>

      <configuration>
        <relocations>
          <relocation>
            <pattern>io.github.bakedlibs.dough</pattern>
            <shadedPattern>[YOUR PACKAGE].dough</shadedPattern>
          </relocation>
        </relocations>
      </configuration>

      <executions>
        <execution>
          <phase>package</phase>
          <goals>
            <goal>shade</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

## :sparkles: Features and Documentation
**TODO: Finish this section**

## :headphones: Discord server
You can also find us on Discord by the way!
If you need any help with Dough United or have a question regarding this project, feel free to join and connect with other members of the community.
Note that this server is not as active at times, so response times may vary.

<p align="center">
  <a href="https://discord.gg/C8M6nPyDu6">
    <img
      src="https://discord.com/api/guilds/588806119544061968/widget.png?style=banner3"
      alt="Discord invite to the Slimefun United server"
    />
  </a>
</p>

### Old Discord server
If you want to check out old dough server and find some information there, you're welcomed to join it as well.

<p align="center">
  <a href="https://discord.gg/c8tk8rP8Wb">
    <img
      src="https://discordapp.com/api/guilds/862336191839600650/widget.png?style=banner3"
      alt="Discord invite to the old dough server"
    />
  </a>
</p>