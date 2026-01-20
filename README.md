# :bagel: Dough United

<hr />
<p align="center">
    <a href="https://github.com/Slimefun-United/Dough-United/actions">
        <img alt="Build Status" src="https://github.com/Slimefun-United/Dough-United/actions/workflows/maven.yml/badge.svg?event=push" />
    </a>
    <a href="https://javadoc.io/doc/io.github.slimefun-united/dough-api">
	<img alt="javadocs" src="https://javadoc.io/badge2/io.github.slimefun-united/dough-api/javadoc.svg" />
    </a>
    <a href="https://search.maven.org/search?q=slimefun-united">
        <img alt="Maven Central" src="https://img.shields.io/maven-central/v/io.slimefun-united/dough-united?color=1074ad&logo=apache-maven" />
    </a>
    <a href="https://sonarcloud.io/project/overview?id=slimefun-united_dough-united">
        <img alt="Code Coverage" src="https://sonarcloud.io/api/project_badges/measure?project=slimefun-united_dough-united&metric=coverage" />
    </a>
    <a href="https://sonarcloud.io/project/overview?id=slimefun-united_dough-united">
        <img alt="Maintainability" src="https://sonarcloud.io/api/project_badges/measure?project=slimefun-united_dough-united&metric=sqale_rating" />
    </a>
</p>
<hr />

This is a fork of old Dough, used by the official version of Slimefun and the Gugu Project's one.
Formerly known simply as "Dough" or even earlier as "cs-corelib2", Dough United is a very powerful library aiming to help the everyday Paper plugin developer.
It is packed to the brim with useful features and APIs to use and play around with.

Dough may be more commonly known as the backbone of [Slimefun United](https://github.com/Slimefun-United/Slimefun-United) and in the past of the original [Slimefun](https://github.com/Slimefun/Slimefun4).

## :page_facing_up: Table of contents
1. [Getting Started](#mag-getting-started)
    - [Adding dough via gradle](#adding-dough-via-gradle)
    - [Adding dough via Maven](#adding-dough-via-maven)
2. [Features & Documentation](#sparkles-features-and-documentation)
    - TODO
3. [Discord server](#headphones-discord-server)

## :mag: Getting Started
Dough is hosted on maven-central (OSS Sonatype) for easy access.
Furthermore, it consists of multiple different submodules.

If you want to utilise the entirety of dough, use the artifact `dough-api`.<br>
Otherwise replace `dough-api` in the following examples with whatever module you want to import. Note that
some modules have dependencies on other modules, all modules require `dough-common` as an example.

### Adding dough via gradle
Dough can easily be included in gradle using mavenCentral.<br />
Simply replace `[DOUGH VERSION]` with the most up to date version of dough:
![Maven Central](https://img.shields.io/maven-central/v/io.github.baked-libs/dough?label=latest%20version)

```gradle
repositories {
	mavenCentral()
}

dependencies {
	implementation 'io.github.baked-libs:dough-api:[DOUGH VERSION]'
}
```

To shadow dough and relocate it:
```gradle
plugins {
  id "com.github.johnrengelman.shadow" version "7.0.0"
}

shadowJar {
   relocate "io.github.bakedlibs.dough", "[YOUR PACKAGE].dough"
}
```

### Adding dough via Maven
Dough can easily be included be added using maven-central.<br />
Simply replace `[DOUGH VERSION]` with the most up to date version of dough:
![Maven Central](https://img.shields.io/maven-central/v/io.github.baked-libs/dough?label=latest%20version)

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

To shadow dough and relocate it:
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
    <img src="https://discord.com/api/guilds/588806119544061968/widget.png?style=banner3" alt="Discord invite to Slimefun United server"/>
  </a>
</p>

### Old Discord server
If you want to check out old server and find some information there, you're welcomed to join it as well.

<p align="center">
  <a href="https://discord.gg/c8tk8rP8Wb">
    <img src="https://discordapp.com/api/guilds/862336191839600650/widget.png?style=banner3" alt="Discord invite to old Dough server"/>
  </a>
</p>