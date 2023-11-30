package com.app.githubclient.pojo


import java.io.Serializable

data class Item(
    val id: Long,
    val node_id: String?,
    val name: String,
    val full_name: String?,
    val owner: Owner?,
    val private: Boolean?,
    val html_url: String?,
    val description: String?,
    val fork: Boolean?,
    val url: String?,
    val created_at: String?,
    val updated_at: String?,
    val pushed_at: String?,
    val homepage: String?,
    val size: Long?,
    val stargazers_count: Long?,
    val watchers_count: Long?,
    val language: String?,
    val forks_count: Long?,
    val open_issues_count: Long?,
    val master_branch: String?,
    val default_branch: String?,
    val score: Long?,
    val archive_url: String?,
    val assignees_url: String?,
    val blobs_url: String?,
    val branches_url: String?,
    val contributors_url: String?,
    val comments_url: String?,
    val commits_url: String?,
    val compare_url: String?,
    val teams_url: String?,
    val trees_url: String?,
    val clone_url: String?,
    val mirror_url: String?,
    val hooks_url: String?,
    val svn_url: String?,
    val forks: Long?,
    val open_issues: Long?,
    val watchers: Long?,
    val has_issues: Boolean?,
    val has_projects: Boolean?,
    val has_pages: Boolean?,
    val has_wiki: Boolean?,
    val has_downloads: Boolean?,
    val archived: Boolean?,
    val disabled: Boolean?,
    val visibility: String?,
    val license: License?
): Serializable {
    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + (node_id?.hashCode() ?: 0)
        result = 31 * result + name.hashCode()
        result = 31 * result + (full_name?.hashCode() ?: 0)
        result = 31 * result + (owner?.hashCode() ?: 0)
        result = 31 * result + (private?.hashCode() ?: 0)
        result = 31 * result + (html_url?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (fork?.hashCode() ?: 0)
        result = 31 * result + (url?.hashCode() ?: 0)
        result = 31 * result + (created_at?.hashCode() ?: 0)
        result = 31 * result + (updated_at?.hashCode() ?: 0)
        result = 31 * result + (pushed_at?.hashCode() ?: 0)
        result = 31 * result + (homepage?.hashCode() ?: 0)
        result = 31 * result + (size?.hashCode() ?: 0)
        result = 31 * result + (stargazers_count?.hashCode() ?: 0)
        result = 31 * result + (watchers_count?.hashCode() ?: 0)
        result = 31 * result + (language?.hashCode() ?: 0)
        result = 31 * result + (forks_count?.hashCode() ?: 0)
        result = 31 * result + (open_issues_count?.hashCode() ?: 0)
        result = 31 * result + (master_branch?.hashCode() ?: 0)
        result = 31 * result + (default_branch?.hashCode() ?: 0)
        result = 31 * result + (score?.hashCode() ?: 0)
        result = 31 * result + (archive_url?.hashCode() ?: 0)
        result = 31 * result + (assignees_url?.hashCode() ?: 0)
        result = 31 * result + (blobs_url?.hashCode() ?: 0)
        result = 31 * result + (branches_url?.hashCode() ?: 0)
        result = 31 * result + (contributors_url?.hashCode() ?: 0)
        result = 31 * result + (comments_url?.hashCode() ?: 0)
        result = 31 * result + (commits_url?.hashCode() ?: 0)
        result = 31 * result + (compare_url?.hashCode() ?: 0)
        result = 31 * result + (teams_url?.hashCode() ?: 0)
        result = 31 * result + (trees_url?.hashCode() ?: 0)
        result = 31 * result + (clone_url?.hashCode() ?: 0)
        result = 31 * result + (mirror_url?.hashCode() ?: 0)
        result = 31 * result + (hooks_url?.hashCode() ?: 0)
        result = 31 * result + (svn_url?.hashCode() ?: 0)
        result = 31 * result + (forks?.hashCode() ?: 0)
        result = 31 * result + (open_issues?.hashCode() ?: 0)
        result = 31 * result + (watchers?.hashCode() ?: 0)
        result = 31 * result + (has_issues?.hashCode() ?: 0)
        result = 31 * result + (has_projects?.hashCode() ?: 0)
        result = 31 * result + (has_pages?.hashCode() ?: 0)
        result = 31 * result + (has_wiki?.hashCode() ?: 0)
        result = 31 * result + (has_downloads?.hashCode() ?: 0)
        result = 31 * result + (archived?.hashCode() ?: 0)
        result = 31 * result + (disabled?.hashCode() ?: 0)
        result = 31 * result + (visibility?.hashCode() ?: 0)
        result = 31 * result + (license?.hashCode() ?: 0)
        return result
    }
}