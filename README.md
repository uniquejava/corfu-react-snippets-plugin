# React.js Code Snippet plugin

1. 原作者没有在  TypeScript 下设置 Top level statement, 导致这个插件在 `tsx`中不好使, 所以我决定自己写一遍这个插件
2. 按需定制 code snippet, 满足开发所需.

![768](https://image-1315592840.cos.ap-shanghai.myqcloud.com/obsidian/20240403003839.png)

## IJ 最小依赖版本

在 gradle.properties 有指定 (这两个参数会被 build.gradle.kts 引用)

```
platformType = IC
platformVersion = 2022.1.4
```

虽然我开发时使用的 IDE 是 IJ 2023.3.6, 但是gradle build 会打印如下日志:

Download https://cache-redirector.jetbrains.com/www.jetbrains.com/intellij-repository/releases/com/jetbrains/intellij/idea/ideaIC/2022.1.4/ideaIC-2022.1.4.zip (14.14 MB / 670.24 MB)

这是默认的测试这个插件的基准 IDE.

能不能指定一个本地的地址? 这样就不用重新下载 IDE. 

https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html#oyybmv_132

可以? 见 [build.gradle.kts](build.gradle.kts) line 44 开始的代码
 
`localPath = /Users/cyper/Applications/WebStorm.app/Contents`

## 这个 README.md 也是 有要求的, 不是随便写

不然会报下面这样的错误, 这个错误其实也是 build.gradle.kts 打印出来的, build 的过程中会读这个 README.md 文件.

```
Execution failed for task ':patchPluginXml'.
> Error while evaluating property 'pluginDescription' of task ':patchPluginXml'.
   > Plugin description section not found in README.md:
     <!-- Plugin description --> ... <!-- Plugin description end -->

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
```

## Build 以后的产物

执行 ./gradlew build

`build/distributions/Corfu React Snippets-0.0.2.zip`

## 以下内容是固定格式

<!-- Plugin description -->
React 2024 Code Snippet Plugin.
<!-- Plugin description end -->

<!-- Plugin description end -->

## Installation

---
- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Modern React Snippets"</kbd> >
  <kbd>Install Plugin</kbd>
  
---

- Manually:
  Download the [latest release](https://github.com/uniquejava/corfu-react-snippets-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

---
## Inspiration 
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This project is a rebuild of [ES7+ React/Redux/React-Native snippets](https://github.com/ults-io/vscode-react-javascript-snippets) for Jetbrains IDEs.
