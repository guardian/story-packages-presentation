package com.gu.storypackage.presentation

import com.gu.contentapi.client.model.v1.{ Package => CapiPackage, PackageArticle }

object StoryPackagePresentation {

  /**
   * Transform the story package information returned from CAPI
   * into something suitable for rendering.
   *
   * @param capiPackage the `package` field of a CAPI item response
   * @return a story package suitable for rendering
   */
  def transform(capiPackage: CapiPackage): StoryPackage = {
    val items = capiPackage.articles.map(transformArticle)
    StoryPackage(items)
  }

  /**
   * Combine the article content and the metadata from the packages tool
   * into one model suitable for rendering.
   */
  def transformArticle(article: PackageArticle): StoryPackageItem = {
    val url = article.content.webUrl
    val headline = article.metadata.headline getOrElse article.content.webTitle

    // TODO more transformation logic

    StoryPackageItem(url, headline)
  }

}
