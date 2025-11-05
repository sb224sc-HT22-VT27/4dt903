# Contributing to 4DT903 / 4DV651 Project

Thank you for contributing to this project! This guide will help you understand our workflow and best practices.

## Table of Contents
- [Pull Request Process](#pull-request-process)
- [PR Merge Strategy](#pr-merge-strategy)
- [Commit Message Guidelines](#commit-message-guidelines)
- [Code Review Process](#code-review-process)

## Pull Request Process

1. **Create a Branch**: Create a feature branch from `main` for your work
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Make Changes**: Make your changes with clear, focused commits

3. **Push Changes**: Push your branch to the repository
   ```bash
   git push origin feature/your-feature-name
   ```

4. **Create Pull Request**: Open a PR against the `main` branch with:
   - Clear title describing the change
   - Description explaining what and why
   - Reference to related issues (e.g., "Fixes #123")

5. **Code Review**: Wait for review and address feedback

6. **Merge**: Once approved, a maintainer will merge your PR

## PR Merge Strategy

This project uses **squash merging** for all pull requests into the `main` branch.

### Why Squash Merge?

**Squash merging** combines all commits from a PR into a single commit on the main branch. We chose this strategy because:

✅ **Clean History**: Main branch has a clear, linear history with one commit per feature/fix  
✅ **Easy Tracking**: Each PR becomes a single, well-documented commit  
✅ **Simpler Navigation**: Easier to understand project evolution and use `git bisect`  
✅ **Flexible Development**: Contributors can make as many WIP commits as needed without cluttering main  

### How It Works

When merging a PR:
```bash
# Maintainer will use:
git merge --squash feature-branch
git commit -m "Descriptive message about the PR"
```

Or through GitHub UI:
- Select "Squash and merge" button
- Edit the commit message to be descriptive
- Include PR number in the commit message

### Alternative: Rebase (Not Used)

We considered but **did not adopt** rebase merging (`git merge --rebase`) because:
- ❌ It preserves all individual commits, which can clutter history
- ❌ Requires cleaner commit messages during development
- ❌ Makes history harder to navigate for learning purposes

**Note**: While we squash PRs into main, you can still use `git rebase` locally to clean up your branch before creating a PR.

## Commit Message Guidelines

Since all commits will be squashed, your individual commit messages don't need to be perfect. However, the **final squash commit message** should follow this format:

```
<type>: <short description>

<longer description if needed>

Fixes #<issue-number>
```

### Types
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `refactor`: Code refactoring
- `test`: Adding or updating tests
- `chore`: Maintenance tasks

### Examples
```
feat: Add EMF model validation for data pipelines

Implements validation logic for the data analysis pipeline
generation system. Includes error handling and user feedback.

Fixes #42
```

```
fix: Resolve null pointer in Test-Case-Gen

Fixed NPE when processing YAML input files without optional fields.

Fixes #15
```

## Code Review Process

1. **Self-Review**: Review your own changes before requesting review
2. **Automated Checks**: Ensure any CI/CD checks pass
3. **Peer Review**: At least one approval required before merge
4. **Address Feedback**: Make changes as requested by reviewers
5. **Final Approval**: Maintainer approves and performs squash merge

## Questions?

If you have questions about the contributing process, please:
- Open an issue with the `question` label
- Ask in the project discussions
- Contact the course instructors

Thank you for your contributions! 🎉
