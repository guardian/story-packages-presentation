package com.gu.storypackage.presentation

case class StoryPackage(items: Seq[StoryPackageItem])

case class StoryPackageItem(
  url: String,
  headline: String
// TODO add a bunch more fields here
)
