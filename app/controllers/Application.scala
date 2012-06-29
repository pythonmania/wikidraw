package controllers

import play.api._
import play.api.mvc._
import dispatch._

object Application extends Controller {

  def index = Action {
    Ok(views.html.main())
  }

  def githubIssues() = Action {
    val res = Http(url("https://api.github.com/repos/pythonmania/wikidraw/issues") as_str)
    Ok(res).as(JSON)
  }
}