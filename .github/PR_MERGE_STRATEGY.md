# PR Merge Strategy Decision

## Decision
This project uses **squash merging** for all pull requests into the `main` branch.

## Context
As an academic project (4DT903 / 4DV651 - Project in Model-based development), we needed to establish a consistent approach for merging pull requests. The two main options considered were:

1. **Squash Merge** (`git merge --squash`)
2. **Rebase Merge** (`git merge --rebase` or `git rebase`)

## Rationale

### Why Squash Merge?

#### 1. **Clean Main Branch History**
- Each PR becomes a single, atomic commit on `main`
- Easy to understand what changed and when
- Simple to navigate project history
- Makes `git log` output readable and meaningful

#### 2. **Flexible Development Process**
- Contributors can make as many commits as needed during development
- No pressure to maintain perfect commit history during work
- Freedom to use WIP commits, fix-up commits, etc.
- All development commits are preserved in the PR for review

#### 3. **Better for Learning Environment**
- Students can focus on the work, not git history management
- Reduces git-related confusion and merge conflicts
- Clear correspondence between issues/features and commits
- Easier to demonstrate project progress to instructors

#### 4. **Simplified Debugging**
- `git bisect` works on feature-level granularity
- Easy to revert entire features if needed
- Clear blame attribution to feature PRs
- Reduced noise when investigating issues

### Why Not Rebase Merge?

While rebase merging has benefits, we decided against it because:

#### 1. **Complexity for Contributors**
- Requires understanding of interactive rebasing
- Need to maintain clean commit messages during development
- More opportunities for git conflicts
- Higher learning curve for students

#### 2. **Commit Noise**
- Preserves all development commits including WIP and fixes
- Can clutter main branch with implementation details
- Makes high-level project understanding harder
- Difficult to identify feature boundaries

#### 3. **Inconsistent History Quality**
- Quality of commit messages varies by contributor
- Some developers use detailed commits, others don't
- Hard to enforce consistent standards in academic setting
- Review feedback commits add noise

## Implementation

### GitHub Settings (Manual Configuration Required)

To enforce squash merging in GitHub repository settings:

1. Go to repository Settings → General → Pull Requests
2. Enable: ☑ **Allow squash merging**
3. Disable: ☐ Allow merge commits
4. Disable: ☐ Allow rebase merging
5. Enable: ☑ **Automatically delete head branches** (optional but recommended)

### Merge Process

When merging a PR:

1. **Via GitHub UI**:
   - Click "Squash and merge" button
   - Edit the commit message to be descriptive
   - Ensure it references the PR number
   - Format: `type: description (#PR-number)`

2. **Via Command Line** (if needed):
   ```bash
   git checkout main
   git merge --squash feature-branch
   git commit -m "feat: descriptive message
   
   Detailed description if needed.
   
   Fixes #issue-number
   Closes #PR-number"
   git push origin main
   ```

## Alternatives Considered

### Option 1: Regular Merge Commits
**Rejected** because:
- Creates merge commits that add no value
- Non-linear history is harder to understand
- Difficult to see clean project evolution

### Option 2: Rebase and Fast-Forward
**Rejected** because:
- Requires clean commit history from contributors
- Too complex for academic environment
- Forces destructive history rewriting

### Option 3: No Standard (Mixed Approach)
**Rejected** because:
- Inconsistent history is confusing
- Different contributors use different approaches
- Makes history analysis difficult

## Benefits Observed

After implementing squash merge strategy:

✅ Cleaner main branch history  
✅ Easier code review process  
✅ Better documentation of changes  
✅ Reduced contributor confusion  
✅ Simplified project management  

## Review Period

This decision should be reviewed:
- At the end of the course term
- If team composition changes significantly
- If project moves to production environment
- If maintainers find the approach limiting

## References

- [GitHub Docs: About Pull Request Merges](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/incorporating-changes-from-a-pull-request/about-pull-request-merges)
- [Git Documentation: git-merge](https://git-scm.com/docs/git-merge)
- [Squash vs Rebase: Best Practices](https://www.atlassian.com/git/tutorials/merging-vs-rebasing)

## Questions or Concerns?

If you have questions or concerns about this decision:
1. Open an issue with the `discussion` label
2. Provide specific examples of problems encountered
3. Suggest alternative approaches with rationale

---

**Last Updated**: November 2025  
**Decision Maker**: Project Maintainers  
**Status**: Active
