# story-packages-presentation

[ ![Download](https://api.bintray.com/packages/guardian/story-packages/story-packages-presentation/images/download.svg) ](https://bintray.com/guardian/story-packages/story-packages-presentation/_latestVersion) [![Build Status](https://travis-ci.org/guardian/story-packages-presentation.svg?branch=master)](https://travis-ci.org/guardian/story-packages-presentation)

Takes care of the transformation logic to convert from a story package as returned by CAPI into something that can easily be rendered in frontend/MAPI.

## How to use

Add a resolver to the Bintray Maven repo:

```
resolvers += "Story packages" at "http://dl.bintray.com/guardian/story-packages"
```

and add a dependency:

```
libraryDependencies += "com.gu" %% "story-packages-presentation" % "<version>"
```

See the Bintray badge above for the latest published version.

## How to release a new version

1. Make sure you have a Bintray account, it's been added to the Guardian org, and it has permission to publish artifacts to the `story-packages` Maven repo.

2. Run `sbt bintrayChangeCredentials` and fill in your username and API key. They will be stored in a file in your `~/.sbt` folder.

3. Run `sbt release`. This will bump the version number, publish to Bintray and push the changes to GitHub.
