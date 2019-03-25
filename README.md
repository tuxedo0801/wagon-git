# root1.de wagon-git

[![Build Status](https://travis-ci.com/tuxedo0801/wagon-git.svg?branch=master)](https://travis-ci.com/tuxedo0801/wagon-git)

## How to use

Add to your pom:

```xml
...

    <!-- required to work with git maven repos: wagin-git dependency itself -->
    <pluginRepositories>
        <pluginRepository>
            <id>wagon-git-releases</id>
            <url>https://github.com/tuxedo0801/wagon-git/tree/releases</url>
        </pluginRepository>
    </pluginRepositories>

...    
    
    <build>
        <!-- to actually make use of the wagon-gt plugin -->
        <extensions>
            <extension>
                <groupId>de.root1</groupId>
                <artifactId>wagon-git</artifactId>
                <version>1.0.0</version>
            </extension>
        </extensions>
    </build>

...

    <!-- to be able to deploy to an git maven repo -->
    <distributionManagement>
        <repository>
            <id>my-repo-id</id>
            <url>git:releases://https://bitbucket.org/my_user_name/my_repository.git</url>
        </repository>
    </distributionManagement>

...

    <!-- used to consume a git maven repo -->
    <repositories>
        <repository>
            <id>my-other-repo-id</id>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            <url>https://raw.githubusercontent.com/a_user_name/a_git_repository/releases/</url>
        </repository>
    </repositories>
    

```

Add auth information to your settings.xml:

```xml
    <servers>
        ...
        <server>
            <id>my-repo-id</id>
            <username>myUser</username>
            <password>myPass</password>
        </server>
        ...
    </servers>
```
