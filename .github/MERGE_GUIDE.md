# Quick Reference: Merging Pull Requests

## For Maintainers

This is a quick reference guide for maintainers on how to merge PRs according to our established strategy.

## Default Method: Squash Merge via GitHub UI

**This is the recommended approach** for most PRs:

1. Navigate to the PR on GitHub
2. Ensure all checks pass and approvals are in place
3. Click the dropdown next to "Merge pull request"
4. Select **"Squash and merge"**
5. Edit the commit message:
   - Use format: `type: description (#PR-number)`
   - Include reference to issue: `Fixes #issue-number`
   - Example:
     ```
     feat: Add data pipeline validation (#42)
     
     Implements validation for the data analysis pipeline generator.
     Includes error handling and user feedback.
     
     Fixes #38
     ```
6. Click "Confirm squash and merge"

## Alternative: Command Line Squash Merge

If you need to merge from command line:

```bash
# 1. Ensure you're on main and up to date
git checkout main
git pull origin main

# 2. Squash merge the feature branch
git merge --squash feature-branch-name

# 3. Commit with a descriptive message
git commit -m "type: description

Detailed explanation if needed.

Fixes #issue-number
Closes #PR-number"

# 4. Push to main
git push origin main

# 5. Delete the feature branch (optional)
git branch -d feature-branch-name
git push origin --delete feature-branch-name
```

## Commit Message Format

```
<type>: <short description> (#PR-number)

<optional longer description>

Fixes #<issue-number>
```

### Types
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `refactor`: Code refactoring
- `test`: Test changes
- `chore`: Maintenance

## GitHub Repository Settings

To enforce this policy, configure repository settings:

**Settings → General → Pull Requests:**
- ☑ Allow squash merging
- ☐ Allow merge commits (disabled)
- ☐ Allow rebase merging (disabled)
- ☑ Automatically delete head branches (recommended)

**Settings → Branches → Branch Protection Rules (for `main`):**
- ☑ Require pull request reviews before merging
- ☑ Require status checks to pass before merging
- ☑ Require branches to be up to date before merging

## Common Scenarios

### Small PR (1-2 commits)
→ Standard squash merge

### Large PR (many commits)
→ Standard squash merge (all commits become one)

### Multiple related changes
→ Consider splitting into separate PRs, each gets squashed

### Documentation only
→ Standard squash merge with `docs:` prefix

### Urgent hotfix
→ Standard squash merge with `fix:` prefix

## What Not to Do

❌ **Don't use regular merge commits** - creates merge commit noise  
❌ **Don't rebase and fast-forward** - not our strategy  
❌ **Don't merge without squashing** - pollutes history  
❌ **Don't forget to reference issue numbers** - breaks tracking  

## Questions?

- Check [CONTRIBUTING.md](../CONTRIBUTING.md)
- Review [PR_MERGE_STRATEGY.md](PR_MERGE_STRATEGY.md)
- Ask in project discussions

---

**Remember**: Consistency is key. Always use squash merge for all PRs.
