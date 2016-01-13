package com.gu.storypackage.presentation

import com.gu.contentapi.client.model.v1.{ PackageArticle, ContentType, Content }
import com.gu.storypackage.model.v1.{ ArticleType, Article => Metadata }
import org.scalatest._

class StoryPackagePresentationSpec extends FlatSpec with Matchers {

  behavior of "#transformArticle"

  val metadata = Metadata(
    id = "internal-code/page/123",
    articleType = ArticleType.Article,
    headline = Some("Custom headline")
  )
  val content = Content(
    id = "internal-code/page/123",
    `type` = ContentType.Article,
    webTitle = "Young Americans",
    webUrl = "http://www.theguardian.com/foo/bar/baz",
    apiUrl = "https://content.guardianapis.com/foo/bar/baz"
  )
  val article = PackageArticle(metadata, content)

  it should "use the content's webUrl as the url" in {
    StoryPackagePresentation.transformArticle(article).url should be("http://www.theguardian.com/foo/bar/baz")
  }

  it should "use the metadata's headline if it is defined" in {
    StoryPackagePresentation.transformArticle(article).headline should be("Custom headline")
  }

  it should "use the content's webTitle if no custom headline is defined" in {
    val articleWithoutCustomHeadline = PackageArticle(metadata.copy(headline = None), content)
    StoryPackagePresentation.transformArticle(articleWithoutCustomHeadline).headline should be("Young Americans")
  }

}
